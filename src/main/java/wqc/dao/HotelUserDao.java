package wqc.dao;

import io.swagger.annotations.Example;
import org.springframework.stereotype.Repository;
import wqc.example.HotelUserExample;
import wqc.mapper.HotelUserMapper;
import wqc.mapper.OrderMapper;
import wqc.model.HotelUserModel;
import wqc.model.OrderModel;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName: HotelUserDao
 * @Description: 酒店房间管理系统
 * @Author: wqc
 * @Date: 2022/2/28 21:12
 **/
@Repository("/HotelUserDao")
public class HotelUserDao {
    @Resource
    private HotelUserMapper hotelUserMapper;

    public List<HotelUserModel> queryByUserAccount(String userAccount) {
        HotelUserExample example = new HotelUserExample();
        example.createCriteria().andUserAccountEqualTo(userAccount);
        return hotelUserMapper.selectByExample(example);
    }

    public int saveUser(HotelUserModel model) {
        return hotelUserMapper.insert(model);
    }

    public int updateUser(HotelUserModel model) {
        return hotelUserMapper.updateByPrimaryKey(model);
    }

    public int deleteUser(Long userId) {
        return hotelUserMapper.deleteByPrimaryKey(userId);
    }
}

package wqc.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import wqc.dao.HotelUserDao;
import wqc.model.HotelUserModel;
import wqc.services.HotelUserService;

import java.time.LocalDate;
import java.util.List;

/**
 * @ClassName: HotelUserServiceImpl
 * @Description: 酒店房间管理系统
 * @Author: wqc
 * @Date: 2022/2/28 21:11
 **/
@Service("/HotelUserService")
public class HotelUserServiceImpl implements HotelUserService {
    @Autowired
    private HotelUserDao hotelUserDao;

    @Override
    public List<HotelUserModel> searchByUserAccount(String userAccount) {
        return hotelUserDao.queryByUserAccount(userAccount);
    }

    @Override
    @Transactional
    public int saveUserAccount(HotelUserModel model) {
        model.setUserId(null);
        model.setCreateDate(LocalDate.now());
        model.setUpdateDate(LocalDate.now());
        return hotelUserDao.saveUser(model);
    }

    @Override
    @Transactional
    public int updateUserAccount(HotelUserModel model) {
        model.setUpdateDate(LocalDate.now());
        return hotelUserDao.updateUser(model);
    }

    @Override
    @Transactional
    public int deleteUserAccount(Long userId) {
        return hotelUserDao.deleteUser(userId);
    }
}

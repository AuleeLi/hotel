package wqc.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import wqc.mapper.OrderMapper;
import wqc.model.OrderModel;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName: OrderDao
 * @Description: 酒店房间管理系统
 * @Author: wqc
 * @Date: 2022/2/28 21:12
 **/
@Repository("/OrderDao")
public class OrderDao {
    @Resource
    private OrderMapper orderMapper;
    public List<OrderModel> searchOrderByName(String customerName, Integer orderFlag) {
        return orderMapper.searchOrderByName(customerName, String.valueOf(orderFlag));
    }
}

package wqc.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import wqc.dao.OrderDao;
import wqc.model.OrderModel;
import wqc.services.OrderService;

import java.util.List;

/**
 * @ClassName: OrderServiceImpl
 * @Description: 酒店房间管理系统
 * @Author: wqc
 * @Date: 2022/2/28 21:11
 **/
@Service("/OrderService")
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderDao orderDao;
    @Override
    public List<OrderModel> searchOrderByName(String customerName, Integer orderFlag) {
        return orderDao.searchOrderByName(customerName, orderFlag);
    }
}

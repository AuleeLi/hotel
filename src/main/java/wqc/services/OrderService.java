package wqc.services;

import wqc.model.OrderModel;

import java.util.List;

/**
 * @ClassName: OrderService
 * @Description: 酒店房间管理系统
 * @Author: wqc
 * @Date: 2022/2/28 21:10
 **/
public interface OrderService {
    List<OrderModel> searchOrderByName(String customerName, Integer orderFlag);
}

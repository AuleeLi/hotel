package wqc.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import wqc.model.OrderModel;

import java.util.List;

/**
 * @ClassName: OrderMapper
 * @Description: 酒店房间管理系统
 * @Author: wqc
 * @Date: 2022/2/28 21:03
 **/
@Mapper
public interface OrderMapper {
    List<OrderModel> searchOrderByName(@Param("customerName") String customerName, @Param(value = "orderFlag") String orderFlag);
}

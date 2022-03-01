package wqc.api;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import wqc.model.OrderModel;
import wqc.services.OrderService;

import java.util.List;

/**
 * @ClassName: OrderController
 * @Description: 酒店房间管理系统
 * @Author: wqc
 * @Date: 2022/2/28 21:10
 **/
@Api(tags = "订单相关接口OrderController")
@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private OrderService orderService;
    @ApiOperation("获取订单信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "customerName", value = "顾客姓名", dataType = "String", required = false),
            @ApiImplicitParam(name = "orderFlag", value = "订单状态", dataType = "String")
    })

    @GetMapping("/searchOrderByName")
    public List<OrderModel> searchOrderByName(@RequestParam(required = false) String customerName, @RequestParam Integer orderFlag) {
        return orderService.searchOrderByName(customerName, orderFlag);



    }
}

package wqc.model;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * @ClassName: OrderModel
 * @Description: 酒店房间管理系统
 * @Author: wqc
 * @Date: 2022/2/28 21:15
 **/
@Data
public class OrderModel implements Serializable {
    private Long id;
    private Long order_id;
    private String customer_name;
    private Long phone_num;
    private LocalDate come_date;
    private LocalDate leave_date;
    private String remark;
    private Integer order_flag;
}

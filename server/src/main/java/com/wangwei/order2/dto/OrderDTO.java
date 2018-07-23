package com.wangwei.order2.dto;

import com.wangwei.order2.dataobject.OrderDetail;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

/**
 * @Auther wangwei
 * @Date 2018/4/8 上午12:44
 */
@Data
public class OrderDTO {

    /** 订单ID */
    private String orderId;

    /** 买家名字 */
    private String buyerName;

    /** 买家电话 */
    private String buyerPhone;

    /** 买家地址 */
    private String buyerAddress;

    /** 买家微信openID */
    private String buyerOpenid;

    /** 订单总金额 */
    private BigDecimal orderAmount;

    /** 订单状态, 默认为新下单  */
    private Integer orderStatus;

    /** 支付状态, 默认未支付 */
    private Integer payStatus;

    private List<OrderDetail> orderDetailList;
}

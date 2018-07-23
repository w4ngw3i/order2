package com.wangwei.order2.dataobject;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @Auther wangwei
 * @Date 2018/4/7 下午10:05
 */
@Data
@Entity
public class OrderMaster {

    /** 订单ID */
    @Id
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

    /** 订单状态, 默认为0新下单  */
    private Integer orderStatus;

    /** 支付状态, 默认为0未支付 */
    private Integer payStatus;

    /** 更新时间 */
    private Date updateTime;

    /** 创建时间 */
    private Date createTime;

}

package com.wangwei.order2.enums;

import lombok.Getter;

/**
 * @Auther wangwei
 * @Date 2018/4/7 下午10:32
 */
@Getter
public enum OrderStatusEnum {
    NEW(0, "新订单"),
    FINISH(1, "订单完结"),
    CANCEL(2, "取消订单");

    private Integer code;

    private String msg;

    OrderStatusEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}

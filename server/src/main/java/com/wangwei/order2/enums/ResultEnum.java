package com.wangwei.order2.enums;

import lombok.Getter;

/**
 * @Auther wangwei
 * @Date 2018/4/8 上午1:35
 */
@Getter
public enum ResultEnum {

    PARAM_ERROR(1, "参数错误"),
    CART_EMPTY(2, "购物车为空"),
    ;

    private Integer code;

    private String msg;

    ResultEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}

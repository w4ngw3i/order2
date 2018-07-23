package com.wangwei.order2.enums;

import lombok.Getter;

/**
 * @Auther wangwei
 * @Date 2018/4/7 下午10:36
 */
@Getter
public enum  PayStatusEnum {

    WAIT(0, "等待支付"),
    SUCCESS(1, "支付成功");

    private Integer code;

    private String msg;

    PayStatusEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}

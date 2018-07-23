package com.wangwei.order2.exception;


import com.wangwei.order2.enums.ResultEnum;

/**
 * @Auther wangwei
 * @Date 2018/4/8 上午1:31
 */
public class OrderException extends RuntimeException {

    private Integer code;

    public OrderException(Integer code, String message){
        super(message);
        this.code = code;
    }

    public OrderException(ResultEnum resultEnum){
        super(resultEnum.getMsg());
        this.code = resultEnum.getCode();
    }
}

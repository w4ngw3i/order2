package com.wangwei.order2.VO;

import lombok.Data;

/**
 * @Auther wangwei
 * @Date 2018/4/8 上午2:02
 */
@Data
public class ResultVO<T> {

    private Integer code;

    private String msg;

    private T data;
}

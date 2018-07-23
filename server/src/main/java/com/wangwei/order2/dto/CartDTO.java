package com.wangwei.order2.dto;

import lombok.Data;

/**
 * @Auther wangwei
 * @Date 2018/4/9 下午4:28
 */
@Data
public class CartDTO {

    /**
     * 商品ID
     */
    private String productId;

    /**
     * 商品数量
     */
    private Integer productQuantity;

    public CartDTO() {
    }

    public CartDTO(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}

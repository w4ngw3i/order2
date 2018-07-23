package com.wangwei.order2.service;

import com.wangwei.order2.dto.OrderDTO;

/**
 * @Auther wangwei
 * @Date 2018/4/7 下午10:51
 */
public interface OrderService {

    /**
     * 创建订单
     * @param orderDTO
     * @return
     */
    OrderDTO create(OrderDTO orderDTO);
}

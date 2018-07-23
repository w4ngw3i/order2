package com.wangwei.order2.converter;


import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.wangwei.order2.dataobject.OrderDetail;
import com.wangwei.order2.dto.OrderDTO;
import com.wangwei.order2.enums.ResultEnum;
import com.wangwei.order2.exception.OrderException;
import com.wangwei.order2.form.OrderForm;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther wangwei
 * @Date 2018/4/8 上午1:39
 */
@Slf4j
public class OrderForm2OrderDTO {

    public static OrderDTO convert(OrderForm orderForm){
        Gson gson = new Gson();
        OrderDTO orderDTO = new OrderDTO();

        orderDTO.setBuyerName(orderForm.getName());

        orderDTO.setBuyerAddress(orderForm.getAddress());

        orderDTO.setBuyerOpenid(orderForm.getOpenid());

        orderDTO.setBuyerPhone(orderForm.getPhone());

        List<OrderDetail> orderDetailList = new ArrayList<>();

        try {
            orderDetailList = gson.fromJson(orderForm.getItems(), new TypeToken<List<OrderDetail>>(){}.getType());
        }catch (Exception e){
            log.error("【json转换】错误, string={}", orderForm.getItems());
            throw new OrderException(ResultEnum.PARAM_ERROR);
        }

        orderDTO.setOrderDetailList(orderDetailList);

        return orderDTO;
    }
}

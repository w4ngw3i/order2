package com.wangwei.order2.controller;


import com.wangwei.order2.VO.ResultVO;
import com.wangwei.order2.VO.ResultVOUtil;
import com.wangwei.order2.converter.OrderForm2OrderDTO;
import com.wangwei.order2.dto.OrderDTO;
import com.wangwei.order2.enums.ResultEnum;
import com.wangwei.order2.exception.OrderException;
import com.wangwei.order2.form.OrderForm;
import com.wangwei.order2.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.Map;

/**
 * @Auther wangwei
 * @Date 2018/4/7 下午10:50
 */
@RestController
@RequestMapping("/order")
@Slf4j
public class OrderController {

    @Autowired
    private OrderService orderService;
    /**
     * 1.参数校验
     * 2.查询商品信息（调用商品服务）
     * 3.计算总价
     * 4.扣库存（调用商品服务）
     * 5.订单入库
     */
    @PostMapping("/create")
    public ResultVO<Map<String, String>> create(@Valid OrderForm orderForm,
                                                BindingResult bindingResult){
        if (bindingResult.hasErrors()){
            log.error("【创建订单】参数不正确, orderForm={}", orderForm);
            throw new OrderException(ResultEnum.PARAM_ERROR.getCode(), bindingResult.getFieldError().getDefaultMessage());
        }

        //orderForm >> orderDTO
        OrderDTO orderDTO = OrderForm2OrderDTO.convert(orderForm);

        if (CollectionUtils.isEmpty(orderDTO.getOrderDetailList())){
            log.error("【创建订单】购物车信息为空");
            throw new OrderException(ResultEnum.CART_EMPTY);
        }

        OrderDTO result = orderService.create(orderDTO);

        Map<String, String> map = new HashMap<>();

        map.put("orderId", result.getOrderId());

        return ResultVOUtil.success(map);

    }
}

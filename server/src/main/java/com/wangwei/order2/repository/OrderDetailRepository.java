package com.wangwei.order2.repository;

import com.wangwei.order2.dataobject.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Auther wangwei
 * @Date 2018/4/7 下午10:22
 */
public interface OrderDetailRepository extends JpaRepository<OrderDetail, String> {
}

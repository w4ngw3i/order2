package com.wangwei.order2.repository;

import com.wangwei.order2.dataobject.OrderMaster;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Auther wangwei
 * @Date 2018/4/7 下午10:21
 */
public interface OrderMasterRepository extends JpaRepository<OrderMaster, String> {
}

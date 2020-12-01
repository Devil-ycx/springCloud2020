package com.yu.springCloud.dao;

import com.yu.springCloud.entity.Payment;
import org.apache.ibatis.annotations.Param;

public interface PaymentDao {
    int create(Payment payment);

    Payment getPaymentById(@Param("id") Long id);
}

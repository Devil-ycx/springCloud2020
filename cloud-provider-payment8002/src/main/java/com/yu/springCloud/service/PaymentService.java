package com.yu.springCloud.service;

import com.yu.springCloud.entity.Payment;

public interface PaymentService {
    int create(Payment payment);

    Payment getPaymentById(Long id);
}

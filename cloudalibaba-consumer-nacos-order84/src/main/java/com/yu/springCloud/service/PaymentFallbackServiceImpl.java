package com.yu.springCloud.service;

import com.yu.springCloud.entity.CommonResult;
import com.yu.springCloud.entity.Payment;
import org.springframework.stereotype.Service;

@Service
public class PaymentFallbackServiceImpl implements PaymentService {
    @Override
    public CommonResult<Payment> PaymentSQL(Long id) {
        return new CommonResult<>(444444444, "服务降级返回，----PaymentFallbackServiceImpl", new Payment(id, "errorSerial"));
    }
}
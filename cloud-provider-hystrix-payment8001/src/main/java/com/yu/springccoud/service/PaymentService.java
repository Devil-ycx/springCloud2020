package com.yu.springccoud.service;

import org.springframework.web.bind.annotation.PathVariable;

public interface PaymentService {
    String paymentInfo_OK(Integer id);

    String paymentInfo_Timeout(Integer id);

    String paymentCircuitBreaker(@PathVariable("id") Integer id);
}

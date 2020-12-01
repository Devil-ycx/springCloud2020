package com.yu.springccoud.controller;

import com.yu.springccoud.service.PaymentServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@Slf4j
public class PaymentController {
    @Resource
    private PaymentServiceImpl paymentServiceImpl;


    @GetMapping("payment/hystrix/ok/{id}")
    public String paymentInfo_OK(@PathVariable("id") Integer id) {
        String result = paymentServiceImpl.paymentInfo_OK(id);
        log.info("result: "+result);
        return result;
    }

    @GetMapping("payment/hystrix/timeout/{id}")
    public String paymentInfo_Timeout(@PathVariable("id") Integer id) {
        String result = paymentServiceImpl.paymentInfo_Timeout(id);
        log.info("result: "+result);
        return result;
    }

    //服务熔断
    @GetMapping("payment/circuit/{id}")
    public String paymentCircuitBreaker(@PathVariable("id") Integer id) {
        String result = paymentServiceImpl.paymentCircuitBreaker(id);
        log.info("result: "+result);
        return result;
    }
}

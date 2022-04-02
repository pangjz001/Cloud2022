package com.jbf.springcloud.controller;

import com.jbf.springcloud.entities.CommonResult;
import com.jbf.springcloud.entities.Payment;
import com.jbf.springcloud.service.PaymentFeignService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: zhou
 * @Date: 2022/4/2 - 04 - 02 - 14:53
 * @Description: com.jbf.springcloud.controller
 * @version: 1.0
 */
@RestController
@Slf4j
public class OrderFeignController {
    @Autowired
    private PaymentFeignService paymentFeignService;

    @GetMapping("/consumer/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") long id){
        return paymentFeignService.getPaymentById(id);
    };
    @GetMapping("/consumer/payment/feign/timeout")
    public String paymentFeignTimeout(){
        return paymentFeignService.paymentFeignTimeout();
    }

}

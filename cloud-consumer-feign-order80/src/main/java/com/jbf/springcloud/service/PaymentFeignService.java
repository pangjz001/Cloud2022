package com.jbf.springcloud.service;

import com.jbf.springcloud.entities.CommonResult;
import com.jbf.springcloud.entities.Payment;
import feign.Param;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @Auther: zhou
 * @Date: 2022/4/2 - 04 - 02 - 14:48
 * @Description: com.jbf.springcloud.service
 * @version: 1.0
 */
@FeignClient("CLOUD-PAYMENT-SERVICE")
@Component
public interface PaymentFeignService {
    @GetMapping("/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") long id);

    @GetMapping("/payment/feign/timeout")
    public String paymentFeignTimeout();
}

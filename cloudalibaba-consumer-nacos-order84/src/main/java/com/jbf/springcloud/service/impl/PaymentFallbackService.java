package com.jbf.springcloud.service.impl;

import com.jbf.springcloud.entities.CommonResult;
import com.jbf.springcloud.entities.Payment;
import com.jbf.springcloud.service.PaymentService;
import org.springframework.stereotype.Component;

/**
 * @Auther: zhou
 * @Date: 2022/4/8 - 04 - 08 - 14:19
 * @Description: com.jbf.springcloud.service.impl
 * @version: 1.0
 */
@Component
public class PaymentFallbackService implements PaymentService{

    @Override
    public CommonResult<Payment> paymentSQL(Long id) {
        return new CommonResult<>(444,"服务降级返回，---PaymentFallbackService",new Payment(id,"ErrorSerial"));
    }
}


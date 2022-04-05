package com.jbf.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @Auther: zhou
 * @Date: 2022/4/4 - 04 - 04 - 14:31
 * @Description: com.jbf.springcloud.service
 */

//统一为接口里面的方法进行异常处理
@Component
public class PaymentFallbackService implements PaymentHystrixService {
    @Override
    public String paymentInfo_OK(Integer id) {
        return "----PaymentFallbackService\t fallback-paymentInfo_OK----";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "----PaymentFallbackService\t fallback-paymentInfo_TimeOut----";
    }
}


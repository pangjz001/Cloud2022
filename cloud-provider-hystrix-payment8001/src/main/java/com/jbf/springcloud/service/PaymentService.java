package com.jbf.springcloud.service;

import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * @Auther: zhou
 * @Date: 2022/4/2 - 04 - 02 - 16:19
 * @Description: com.jbf.springcloud.service
 * @version: 1.0
 */
@Service
public class PaymentService {

    //正常访问方法
    public String paymentInfo_OK(Integer id){
        return "线程池：" + Thread.currentThread().getName() + "\tpaymentInfo_OK，id：" + id;
    }


    //超时访问方法
    public String paymentInfo_TimeOut(Integer id){
        int timeNumber = 3;
        try {
            TimeUnit.SECONDS.sleep(timeNumber);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "线程池：" + Thread.currentThread().getName() +
                "\tpaymentInfo_TimeOut，id：" + id + "，耗时：" + timeNumber + "秒";
    }

}


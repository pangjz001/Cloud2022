package com.jbf.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Auther: zhou
 * @Date: 2022/4/2 - 04 - 02 - 16:48
 * @Description: com.jbf.springcloud
 * @version: 1.0
 */
@EnableEurekaClient
@EnableFeignClients
@SpringBootApplication
@EnableHystrix
public class OrderHystrixMain80 {

    public static void main(String[] args) {
        SpringApplication.run(OrderHystrixMain80.class, args);
    }

}


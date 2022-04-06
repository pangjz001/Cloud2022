package com.jbf.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Auther: zhou
 * @Date: 2022/4/6 - 04 - 06 - 14:02
 * @Description: com.jbf.springcloud.controller
 * @version: 1.0
 */
@RestController
@Slf4j
public class OrderNacosController {
    @Autowired
    private RestTemplate restTemplate;

    @Value("${service-url.nacos-user-service}")
    private String serverUrl;
    @GetMapping("/consumer/payment/nacos/{id}")
    public String getPayment(@PathVariable("id") Integer id){
        log.info(serverUrl);
        return restTemplate.getForObject(serverUrl+"/payment/nacos/"+id,String.class);
//        return restTemplate.getForObject("http://nacos-payment-provider/payment/nacos/"+id,String.class);
    }
}

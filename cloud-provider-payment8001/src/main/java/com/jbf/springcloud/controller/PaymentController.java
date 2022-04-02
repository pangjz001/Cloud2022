package com.jbf.springcloud.controller;

import com.jbf.springcloud.Service.PaymentService;
import com.jbf.springcloud.entities.CommonResult;
import com.jbf.springcloud.entities.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @Auther: zhou
 * @Date: 2022/4/1 - 04 - 01 - 14:10
 * @Description: com.jbf.springcloud.controller
 * @version: 1.0
 */
@RestController
@Slf4j
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @Resource
    private DiscoveryClient discoveryClient;

    @Value("${server.port}")
    private String serverPort;
    @PostMapping("/payment/create")
    public CommonResult create(@RequestBody Payment payment){
        int result = paymentService.create(payment);
        log.info("******插入的数据为：" + payment);
        if (result>0){
            return new CommonResult(200,"插入成功,serverPort"+serverPort,result);
        }else {
            return new CommonResult(444,"插入失败",null);
        }
    };

    @GetMapping("/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") long id){
        Payment payment = paymentService.getPaymentById(id);
        log.info("---查询结果为：" +payment);
//        System.out.println(payment);
        if (payment != null){
            return new CommonResult(200,"查询成功,serverPort"+serverPort,payment);
        }else {
            return new CommonResult(444,"查询失败",null);
        }
    };
    @GetMapping("/payment/discovery")
    public Object discovery(){
        //获取服务列表的信息

        List<String> services = discoveryClient.getServices();
        for (String element : services) {
            log.info("*******element：" + element);
        }

        //获取CLOUD-PAYMENT-SERVICE服务的所有具体实例
        List<ServiceInstance> instances = discoveryClient.getInstances("CLOUD-PAYMENT-SERVICE");
        for (ServiceInstance instance : instances) {
            //getServiceId服务器id getHost主机名称 getPort端口号  getUri地址
            log.info(instance.getServiceId() + "\t" + instance.getHost() + "\t" + instance.getPort() + "\t" + instance.getUri());
        }

        return this.discoveryClient;
    }

    @GetMapping("/payment/feign/timeout")
    public String paymentFeignTimeout(){
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return serverPort;
    }

}

package com.jbf.springcloud.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.jbf.springcloud.entities.CommonResult;
import com.jbf.springcloud.entities.Payment;
import com.jbf.springcloud.myhandler.CustomerBlockHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: zhou
 * @Date: 2022/4/8 - 04 - 08 - 9:23
 * @Description: com.jbf.springcloud.controller
 * @version: 1.0
 */

@RestController
public class RateLimitController {

    @GetMapping("/byresource")
    @SentinelResource(value = "byresource",blockHandler = "byresourceException")
    public CommonResult testB() {
        return new CommonResult(200,"成功",new Payment(2020L,"serial001"));
    }
    public CommonResult byresourceException(BlockException excepotion){
        return new CommonResult(444,excepotion.getClass().getCanonicalName(),"服务不可用");
    }
    //CustomerBlockHandler
    @GetMapping("/rateLimit/customerBlockHandler")
    @SentinelResource(value = "customerBlockHandler",
            blockHandlerClass = CustomerBlockHandler.class, blockHandler = "handlerException2")
    public CommonResult customerBlockHandler() {
        return  new CommonResult(200,"按照客户自定义限流测试",new Payment(2020L,"serial003"));
    }
    @GetMapping("/rateLimit/byUrl")
    @SentinelResource(value = "byUrl")	//没有兜底方法，系统就用默认的
    public CommonResult byUrl() {
        return  new CommonResult(200,"按照byUrl限流测试",new Payment(2020L,"serial002"));
    }


}

package com.jbf.springcloud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: zhou
 * @Date: 2022/4/7 - 04 - 07 - 14:44
 * @Description: com.jbf.springcloud.controller
 * @version: 1.0
 */
@RestController
public class FlowLimitController {

    @GetMapping("/testA")
    public String testA() {
        return "----testA";
    }

    @GetMapping("/testB")
    public String testB() {
        return "----testB";
    }

}


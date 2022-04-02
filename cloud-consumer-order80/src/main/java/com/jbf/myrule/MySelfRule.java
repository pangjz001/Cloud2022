package com.jbf.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Auther: zhou
 * @Date: 2022/4/2 - 04 - 02 - 14:09
 * @Description: com.jbf.myrule
 * @version: 1.0
 */
@Configuration
public class MySelfRule {

    @Bean
    public IRule myRule(){
        return new RandomRule();    //负载均衡机制改为随机
    }

}


package com.jbf.springcloud.config;

/**
 * @Auther: zhou
 * @Date: 2022/4/2 - 04 - 02 - 15:45
 * @Description: com.jbf.springcloud.config
 * @version: 1.0
 */
import feign.Logger;	//不要导错包
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeignConfig {

    @Bean
    Logger.Level feignLoggerLevel(){
        //打印最详细的日志
        return Logger.Level.FULL;
    }

}


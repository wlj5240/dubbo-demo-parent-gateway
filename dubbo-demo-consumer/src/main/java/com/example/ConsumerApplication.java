package com.example;

import com.alibaba.boot.dubbo.EnableDubboAutoConfiguration;
import com.alibaba.dubbo.config.ProtocolConfig;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * Created by wuyu on 2017/4/11.
 */
@EnableDubboAutoConfiguration
@SpringBootApplication
public class ConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class, args);
    }

    @Bean
    public ProtocolConfig feignProtocolConfig(@Value("${server.port}")Integer port){
        return new ProtocolConfig("feign",port);
    }
}

package com.example;

import com.alibaba.boot.dubbo.EnableDubboAutoConfiguration;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.context.annotation.ComponentScan;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.management.ManagementFactory;

@EnableAutoConfiguration
@ComponentScan("com.example")
@MapperScan("com.example.dao")
@EnableAspectJAutoProxy
@EnableTransactionManagement
@EnableDubboAutoConfiguration
@EnableSwagger2//see http://localhost:8080/swagger-ui.html
public class DubboDemoApplication {

    public static void main(String[] args) throws IOException {
        SpringApplication.run(DubboDemoApplication.class, args);
    }

}

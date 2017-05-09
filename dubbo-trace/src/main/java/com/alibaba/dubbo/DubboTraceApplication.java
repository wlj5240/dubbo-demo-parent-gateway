package com.alibaba.dubbo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zipkin.server.EnableZipkinServer;

/**
 * Created by wuyu on 2017/5/4.
 */
@SpringBootApplication
@EnableZipkinServer
public class DubboTraceApplication {

    public static void main(String[] args) {
        SpringApplication.run(DubboTraceApplication.class, args);
    }

}

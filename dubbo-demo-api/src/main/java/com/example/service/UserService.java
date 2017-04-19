package com.example.service;

import com.alibaba.boot.dubbo.DubboClient;
import com.alibaba.dubbo.config.annotation.Reference;
import com.example.model.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created on 2017/04/11 15:49
 */
@FeignClient(path = "/user")
@DubboClient(protocol = "feign", value = @Reference(timeout = 10000, version = "1.0.0"))
public interface UserService {

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    User selectByPrimaryKey(@PathVariable("id") Long id);

    @RequestMapping(value = "{id}", method = RequestMethod.DELETE)
    int deleteByPrimaryKey(@PathVariable("id") Long id);

    @RequestMapping(value = "/", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    Object insert(@RequestBody User t);

    @RequestMapping(value = "/", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    Object updateByPrimaryKey(@RequestBody User t);


}

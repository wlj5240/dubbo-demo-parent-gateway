package com.example.filter;

import com.alibaba.dubbo.common.Constants;
import com.alibaba.dubbo.common.extension.Activate;
import com.alibaba.dubbo.rpc.*;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;


@Activate(group = Constants.PROVIDER)
public class UserServiceFilter implements Filter {

    @Autowired
    private UserService userService;

    @Override
    public Result invoke(Invoker<?> invoker, Invocation invocation) throws RpcException {
        return invoker.invoke(invocation);
    }
}

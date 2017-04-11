package com.example.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.example.dao.UserDao;
import com.example.model.User;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * Created on 2017/04/11 15:49
 */
@Service
@ResponseBody
@RequestMapping(value = "/user/")
public class UserServiceImpl implements UserService {

    @Autowired
	private UserDao userDao;

    public User selectByPrimaryKey(@PathVariable("id") Long id) {
        return userDao.selectByPrimaryKey(id);
    }

	public Object insert(@RequestBody User t) {
		return userDao.insert(t);
	}

    public Object updateByPrimaryKey(@RequestBody User t) {
        return userDao.updateByPrimaryKey(t);
    }

    public int deleteByPrimaryKey(@PathVariable("id") Long id) {
        return userDao.deleteByPrimaryKey(id);
    }


}

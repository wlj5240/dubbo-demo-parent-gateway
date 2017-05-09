package com.example;

import com.example.model.User;
import com.example.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;

/**
 * Created by wuyu on 2017/4/11.
 */
@SpringBootTest(classes = ConsumerApplication.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class UserServiceTest {

    @Autowired
    private UserService userService;

    @Test
    public void testSelectByPrimaryKey() {
        User user = userService.selectByPrimaryKey(1L);
        System.err.println(user);
    }

    @Test
    public void testInsert() throws InterruptedException {
        for (long i = 0; i < 1000; i++) {
            Thread.sleep(10);
            userService.insert(new User()
                    .setId(i)
                    .setUsername("test")
                    .setPassword("123456")
                    .setCreatedTime(new Date())
                    .setAddress("北京市"));
        }

    }

    @Test
    public void testUpdate() {
        userService.updateByPrimaryKey(new User()
                .setId(2L)
                .setUsername("test")
                .setPassword("123456")
                .setCreatedTime(new Date())
                .setAddress("北京市"));
    }

    @Test
    public void testDelete() {
        userService.deleteByPrimaryKey(1L);
    }
}

package com.lmn.demo;

import com.lmn.demo.controller.UserController;
import com.lmn.demo.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class DemoApplicationTests {

    @Autowired
    private UserController userController;
    @Test
    void contextLoads() {
        List<User> userList = userController.getUserList(1, 10);
        for (User u:userList){
            System.out.println(u.getCreateTime());
        }
    }

}

package com.lmn.demo.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lmn.demo.entity.User;
import com.lmn.demo.service.UserService;
import io.swagger.annotations.*;
import io.swagger.models.auth.In;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * (User)表控制层
 *
 * @author makejava
 * @since 2023-01-11 17:09:51
 */
@RestController
@RequestMapping("/user")
@Api(tags = "用户controller层")
public class UserController {
    @Autowired
    private UserService userService;

    @ApiOperation("测试")
    @GetMapping("/hello")
    public String hello(@ApiParam(value = "测试") String str){
        return "hello vue";
    }

    @GetMapping("/getUserList")
    @ApiOperation("获取用户列表")
    public List<User> getUserList(Integer current, Integer nums){
//        RowBounds rowBounds = new RowBounds(current,nums);
//           return userService.getUserList(rowBounds);
        PageHelper.startPage(current,nums,"create_time desc");
        List<User> userList = userService.getUserList();
        PageInfo<User> userPageInfo = new PageInfo<>(userList);
        return userPageInfo.getList();

    }

}


package com.lmn.demo.service;

import com.github.pagehelper.PageInfo;
import com.lmn.demo.entity.User;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

/**
 * (User)表服务接口
 *
 * @author makejava
 * @since 2023-01-11 17:09:59
 */
public interface UserService{
    List<User> getUserList();
    List<User> getUserList(RowBounds rowBounds);
}

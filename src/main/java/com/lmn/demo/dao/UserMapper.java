package com.lmn.demo.dao;

import com.lmn.demo.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

/**
 * (User)表数据库访问层
 *
 * @author makejava
 * @since 2023-01-11 17:09:57
 */
@Mapper
public interface UserMapper{
    List<User> getUserList();
    List<User> getUserList(RowBounds rowBounds);
}


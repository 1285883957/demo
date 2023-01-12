package com.lmn.demo.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * (User)实体类
 *
 * @author makejava
 * @since 2023-01-11 17:09:57
 */
@Data
public class User extends BaseModel<User>{

    /**
     * 账号
     */
    private String account;
    /**
     * 名称
     */
    private String name;

}


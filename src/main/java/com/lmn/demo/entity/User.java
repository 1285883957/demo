package com.lmn.demo.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * (User)实体类
 *
 * @author makejava
 * @since 2023-01-11 17:09:57
 */
@Data
@ApiModel(description = "用户信息")
public class User extends BaseModel<User>{

    /**
     * 账号
     */
    @ApiModelProperty("账户")
    private String account;
    /**
     * 名称
     */
    private String name;

}


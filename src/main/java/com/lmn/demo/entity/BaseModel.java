package com.lmn.demo.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author lmn
 * @Date 2023/1/11 17:11
 */
@Data
public abstract class BaseModel<T extends BaseModel<?>> implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 主键id
     */
    protected Integer id;

    /**
     * 创建时间（create_time）
     */
    protected Date createTime;

    /**
     * 创建人,对应userId (create_by)
     */
    protected String createBy;

    /**
     * 修改时间 (update_time)
     */
    protected Date updateTime;

    /**
     * 修改人,对应userId (update_by)
     */
    protected String updateBy;
}

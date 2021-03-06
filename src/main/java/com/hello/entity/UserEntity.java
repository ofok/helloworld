package com.hello.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;


import java.io.Serializable;

/**
 * @author jiuge
 * @email 2268898670@qq.com
 * @date 2021-01-28 15:53:24
 */
@Data
@TableName("t_user")
public class UserEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     *
     */
    @TableId
    private Integer id;
    /**
     *
     */
    private String username;
    /**
     *
     */
    private Integer age;

}

package com.hello.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import com.hello.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author jiuge
 * @email 2268898670@qq.com
 * @date 2021-01-28 15:53:24
 */
@Mapper
public interface UserDao extends BaseMapper<UserEntity> {

}

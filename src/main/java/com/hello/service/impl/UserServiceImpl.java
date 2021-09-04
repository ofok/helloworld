package com.hello.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.hello.dao.UserDao;
import com.hello.entity.UserEntity;
import com.hello.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public List<UserEntity> getAll() {
        return userDao.selectList(new QueryWrapper<>());
    }
}

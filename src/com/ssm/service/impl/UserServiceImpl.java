package com.ssm.service.impl;

import com.ssm.dao.UserMapper;
import com.ssm.entity.User;
import com.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Transactional
    @Override
    public List<User> list() {
        return userMapper.list();
    }
}

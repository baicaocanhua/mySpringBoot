package com.maimai.myspringboot.service.impl;

import com.maimai.myspringboot.dao.UserMapper;
import com.maimai.myspringboot.entity.User;
import com.maimai.myspringboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author user
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;
    @Override
    public List<User> getUserList() {
        return userMapper.getUserList();
    }
}

package com.maimai.myspringboot.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.maimai.myspringboot.dao.UserMapper;
import com.maimai.myspringboot.entity.User;
import com.maimai.myspringboot.service.UserService;

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

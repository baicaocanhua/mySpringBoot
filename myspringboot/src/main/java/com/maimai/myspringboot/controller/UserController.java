package com.maimai.myspringboot.controller;

import com.maimai.myspringboot.entity.User;
import com.maimai.myspringboot.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author user
 */
@RestController
@RequestMapping("user")
public class UserController {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);

    @Autowired
    UserService userService;

    /**
     * @return
     */
    @RequestMapping("list")
    public List<User> getUserList() {
        LOGGER.info("11");
        return userService.getUserList();
    }
}

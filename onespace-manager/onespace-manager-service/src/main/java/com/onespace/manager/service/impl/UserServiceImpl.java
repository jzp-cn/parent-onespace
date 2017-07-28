package com.onespace.manager.service.impl;


import com.onespace.manager.mapper.UserMapper;
import com.onespace.manager.pojo.UserTest;
import com.onespace.manager.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by onespace-nb53 on 2017/7/26.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    public UserTest selectUserById(Integer id) {
        return userMapper.selectUserById(id);
    }

    public void inserUser(UserTest userTest) {
        userMapper.insert(userTest);
    }
}

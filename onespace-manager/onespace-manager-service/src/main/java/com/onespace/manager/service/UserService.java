package com.onespace.manager.service;


import com.onespace.manager.pojo.UserTest;

/**
 * Created by onespace-nb53 on 2017/7/26.
 */
public interface UserService {

    UserTest selectUserById(Integer id);

    void inserUser(UserTest userTest);
}

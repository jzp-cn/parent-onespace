package com.onespace.manager.mapper;

import com.onespace.manager.pojo.UserTest;

/**
 * Created by onespace-nb53 on 2017/7/26.
 */
public interface UserMapper {

    UserTest selectUserById(Integer id);

    int insert(UserTest userTest);
}

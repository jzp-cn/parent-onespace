package com.onespace.manager.controller;

import com.onespace.manager.pojo.UserTest;
import com.onespace.manager.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by onespace-nb53 on 2017/7/26.
 */
@Controller
@RequestMapping("/test")
public class UserController {
    private static final Logger logger =  LoggerFactory.getLogger(UserController.class);
    @Autowired
    private UserService itemService;

    @RequestMapping("/queryById/{itemId}")
    public Object queryItemById(@PathVariable(value="itemId") Integer itemId){

        logger.info("insert 进来了");
        UserTest userTest = itemService.selectUserById(itemId);
        logger.info("【返回值为】【{}】 ",userTest);
        return  "login";
    }

    @RequestMapping("/insert")
    public Object queryItemById(@Validated UserTest userTest ){
        logger.info("insert 进来了");
        itemService.inserUser(userTest);
        return  "1";
    }

}

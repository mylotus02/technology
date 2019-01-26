package com.lotus.technology.controller;

import com.lotus.technology.service.UserService;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class UserController {

    @Resource
    private UserService userService;
}

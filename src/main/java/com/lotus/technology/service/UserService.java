package com.lotus.technology.service;

import com.lotus.technology.domain.User;
import com.lotus.technology.mapper.UserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserService {

    @Resource
    private UserMapper userMapper;

    public User queryUserByName(String userName) {
        return userMapper.queryUserByName(userName);
    }

    public User queryUserById(int userId) {
        return userMapper.queryUserById(userId);
    }
}

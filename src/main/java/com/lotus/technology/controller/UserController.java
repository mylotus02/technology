package com.lotus.technology.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.lotus.technology.domain.User;
import com.lotus.technology.service.UserService;
import com.lotus.technology.util.QEncodeUtil;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping(value = "/login")
    public JSONObject login(String userName, String userPwd) {
        JSONObject result = new JSONObject();
        User user = userService.queryUserByName(userName);
        try {
            System.out.println(QEncodeUtil.md5Encrypt(userPwd));
            if (null != user && user.getUserPwd().equals(QEncodeUtil.md5Encrypt(userPwd))) {
                result.put("result", 0);
            } else {
                result.put("result", 1);
                result.put("info", "用户名或密码不正确");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}

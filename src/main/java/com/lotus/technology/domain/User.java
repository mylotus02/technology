package com.lotus.technology.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
public class User implements TechnologyEntry {

    private int userId;
    private String userName;
    private String userPwd;
    private String userTel;
    private String userEmail;
    private int userState;
    private Date createTime;
}

package com.lotus.technology.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
public class Post implements TechnologyEntry {

    private int postId;
    private String postTitle;
    private String postContentt;
    private int userId;
    private int postState;
    private Date createTime;
}

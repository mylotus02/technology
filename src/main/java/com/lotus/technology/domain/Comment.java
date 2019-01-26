package com.lotus.technology.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
public class Comment implements TechnologyEntry {

    private int commentId;
    private String commentText;
    private int userId;
    private int postId;
    private int parentId;
    private int commentState;
    private Date createTime;
}

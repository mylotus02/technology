package com.lotus.technology.mapper;

import com.lotus.technology.domain.User;
import org.apache.ibatis.annotations.Select;

public interface UserMapper {

    @Select("SELECT * FROM user WHERE user_name = #{userName}")
    User queryUserByName(String userName);

    @Select("SELECT * FROM user WHERE user_id = #{userId}")
    User queryUserById(int userId);
}

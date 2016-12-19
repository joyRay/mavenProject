package com.lei.dao.user;

import org.apache.ibatis.annotations.Param;

import com.lei.model.user.UserVO;

public interface IUserDao {
    void addUser(@Param("user")UserVO user);
}

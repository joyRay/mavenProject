package com.lei.service.user.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lei.dao.user.IUserDao;
import com.lei.model.user.UserVO;
import com.lei.service.user.IUserServicer;

@Service("userService")
public class UserServiceImpl implements IUserServicer {
    
    @Autowired
    private IUserDao userDao;
    
    public void addUser(UserVO user){
        userDao.addUser(user);
//        用来验证事务是否起作用
//        throw new RuntimeException("bug");
    }

}

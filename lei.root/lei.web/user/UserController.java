package com.lei.controller.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lei.model.user.UserVO;
import com.lei.service.user.IUserServicer;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserServicer userService;

    @RequestMapping("/login")
    public String login() {
        UserVO user = new UserVO();
        user.setUserId("1");
        user.setUserName("test1");
        user.setPassword("123456");

        try {
            userService.addUser(user);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "user/login";
    }
}
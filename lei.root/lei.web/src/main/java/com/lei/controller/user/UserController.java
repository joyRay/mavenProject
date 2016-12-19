package com.lei.controller.user;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lei.model.user.UserVO;
import com.lei.service.user.IUserServicer;

@Controller
@RequestMapping("user")
public class UserController {

	private static final Logger log = LoggerFactory.getLogger(UserController.class);
	@Autowired
	private IUserServicer userService;

	// http://localhost:8080/lei.web/user/login
	@RequestMapping("/login")
	public String login() {
		UserVO user = new UserVO();
		user.setUserId("1");
		user.setUserName("test1");
		user.setPassword("123456");

		userService.addUser(user);
		return "user/login";
	}
}
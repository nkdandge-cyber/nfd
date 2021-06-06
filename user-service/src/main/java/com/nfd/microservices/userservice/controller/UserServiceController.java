package com.nfd.microservices.userservice.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nfd.microservices.userservice.IUserService;
import com.nfd.microservices.userservice.bean.UserBean;

@RestController
public class UserServiceController {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private IUserService userServiceImpl;

	@PostMapping("/user-service/create")
	public String createUser(@RequestBody UserBean userBean) {
		logger.info("Start createUser Method");
		userServiceImpl.createUser(userBean);

		return "Success";
	}

	@GetMapping("/user-service/userId/{userId}")
	public UserBean getUser(@PathVariable long userId) {
		logger.info("Start getUser Method");
		return userServiceImpl.getUser(userId);
	}

	@PutMapping("/user-service/update")
	public String updateUser(UserBean userBean) {
		logger.info("Start updateUser Method");
		userServiceImpl.updateUser(userBean);
		return "Success";
	}

	@GetMapping("/user-service/create")
	public List<UserBean> getUsers(List<Long> userIds) {
		logger.info("Start getUsers Method");
		return userServiceImpl.getUsers(userIds);
	}

}

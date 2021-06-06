package com.nfd.microservices.userservice;

import java.util.List;

import com.nfd.microservices.userservice.bean.UserBean;

public interface IUserService {
	public void createUser(UserBean userBean);

	public UserBean getUser(long userId);

	public void updateUser(UserBean userBean);
	
	public List<UserBean> getUsers(List<Long> userIds);

}

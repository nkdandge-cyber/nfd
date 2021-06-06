package com.nfd.microservices.userservice;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.nfd.microservices.userservice.bean.UserBean;

public class UserServiceImpl implements IUserService {
	private static List<UserBean> userBeans = new ArrayList<UserBean>();

	static {
		for (int i = 1; i < 10; i++) {
			userBeans.add(new UserBean(i, "username" + i, "petname" + i, true, true, "", new Date(), "", new Date()));
		}
	}

	@Override
	public void createUser(UserBean userBean) {
		userBeans.add(userBean);

	}

	@Override
	public UserBean getUser(long userId) {
		for (UserBean userBean : userBeans) {
			if (userId == userBean.getUserId()) {
				return userBean;
			}
		}
		return null;
	}

	@Override
	public void updateUser(UserBean userBean) {
		for (UserBean currentUserBean : userBeans) {
			if (userBean.getUserId() == currentUserBean.getUserId()) {
				userBean.setUsername(currentUserBean.getUsername());
				userBean.setPetName(currentUserBean.getPetName());
				userBean.setOpted(currentUserBean.isOpted());
				userBean.setPremium(currentUserBean.isPremium());
				userBean.setLastUpdatedBy("tst user");
				userBean.setLastUpdatedTimestamp(new Date());
			}
		}
	}

	@Override
	public List<UserBean> getUsers(List<Long> userIds) {
		List<UserBean> filteredUserBeans = new ArrayList<UserBean>();
		//Filtering logic
		return filteredUserBeans;
	}
}

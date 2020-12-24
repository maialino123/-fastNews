package com.laptrinhJavaWeb.service.impl;

import javax.inject.Inject;

import com.laptrinhJavaWeb.authoritationLogger.IAuthoritationLog;
import com.laptrinhJavaWeb.dao.IUserDAO;
import com.laptrinhJavaWeb.model.usersModel;
import com.laptrinhJavaWeb.service.IUserService;

public class userService implements IUserService{
	
	@Inject private IUserDAO userDAO;

	@Override
	public usersModel findByUserNameAndPasswordAndStatus(IAuthoritationLog authoritationLog) {
		return userDAO.findByUserNameAndPasswordAndStatus(authoritationLog);
	}

}

package com.laptrinhJavaWeb.dao.impl;

import java.util.List;

import com.laptrinhJavaWeb.authoritationLogger.IAuthoritationLog;
import com.laptrinhJavaWeb.dao.IUserDAO;
import com.laptrinhJavaWeb.mapper.usersMapper;
import com.laptrinhJavaWeb.model.usersModel;

public class userDAO extends AbstrachDAO<usersModel> implements IUserDAO {

	@Override
	public usersModel findByUserNameAndPasswordAndStatus(IAuthoritationLog authoritationLog) {
		StringBuilder sql = new StringBuilder("SELECT * FROM users AS u ");
		sql.append("INNER JOIN role AS r ON r.id = u.roleid ");
		sql.append("WHERE u.username = ? AND u.password = ? AND u.status = ? ");
		List<usersModel> usersModels = query(sql.toString(), new usersMapper(), authoritationLog.getUserName(),authoritationLog.getPassWord(),authoritationLog.getStatus());
		return usersModels.isEmpty() ? null : usersModels.get(0);
	}

}

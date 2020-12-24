package com.laptrinhJavaWeb.dao;

import com.laptrinhJavaWeb.authoritationLogger.IAuthoritationLog;
import com.laptrinhJavaWeb.model.usersModel;

public interface IUserDAO extends GenericDAO<usersModel> {
  usersModel findByUserNameAndPasswordAndStatus(IAuthoritationLog authoritationLog);
}

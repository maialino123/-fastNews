package com.laptrinhJavaWeb.service;

import com.laptrinhJavaWeb.authoritationLogger.IAuthoritationLog;
import com.laptrinhJavaWeb.model.usersModel;

public interface IUserService {
 usersModel findByUserNameAndPasswordAndStatus(IAuthoritationLog authoritationLog);
}

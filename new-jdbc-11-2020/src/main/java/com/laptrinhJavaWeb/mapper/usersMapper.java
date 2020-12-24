package com.laptrinhJavaWeb.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.laptrinhJavaWeb.model.roleModel;
import com.laptrinhJavaWeb.model.usersModel;

public class usersMapper implements RowMapper<usersModel>{

	@Override
	public usersModel mapRow(ResultSet rs) {
		try {
			usersModel usersModel = new usersModel();
			usersModel.setId(rs.getLong("id"));
			usersModel.setUserName(rs.getString("username"));
			usersModel.setPassword(rs.getString("password"));
			usersModel.setStatus(rs.getInt("status"));
			usersModel.setRoleId(rs.getLong("roleid"));
			usersModel.setCreatedDate(rs.getTimestamp("createddate"));
			usersModel.setCrreatedBy(rs.getString("createdby"));
			if (rs.getTimestamp("modifieddate") != null) {
				usersModel.setModifiedDate(rs.getTimestamp("modifieddate"));
			}
			if (rs.getString("modifiedby") != null) {
				usersModel.setModifiedBy(rs.getString("modifiedby"));
			}
			try {
				roleModel role = new roleModel();
				role.setCode(rs.getString("code"));
				role.setName(rs.getString("name"));
				usersModel.setRole(role);
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
			return usersModel;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
 
}

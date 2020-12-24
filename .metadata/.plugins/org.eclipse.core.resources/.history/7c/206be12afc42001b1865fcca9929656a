package com.laptrinhJavaWeb.model;

public class usersModel extends abstractModel<usersModel> {

	private String userName;
	private String password;
	private String fullName;
	private int status;
	private Long roleId;
	private roleModel role = new roleModel();

	public roleModel getRole() {
		return role;
	}

	public void setRole(roleModel role) {
		this.role = role;
	}

	public usersModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public usersModel(String userName, String password, String fullName, int status, Long roleId) {
		super();
		this.userName = userName;
		this.password = password;
		this.fullName = fullName;
		this.status = status;
		this.roleId = roleId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public Long getRoleId() {
		return roleId;
	}

	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}

}

package com.laptrinhJavaWeb.authoritationLogger;

public class authoritater implements IAuthoritationLog {
	
	private String userName;
	private String password;
	private Integer status;
	
	

	public authoritater(String userName, String password, Integer status) {
		super();
		this.userName = userName;
		this.password = password;
		this.status = status;
	}



	@Override
	public String getUserName() {
		return this.userName;
	}



	@Override
	public String getPassWord() {
		return this.password;
	}



	@Override
	public Integer getStatus() {
		
		return this.status;
	}

	

}

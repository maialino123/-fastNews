package com.laptrinhJavaWeb.model;



public class categoriesModel extends abstractModel<categoriesModel> {

	private String name;
	private String code;
	public categoriesModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public categoriesModel(String name, String code) {
		super();
		this.name = name;
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}

	

}

package com.laptrinhJavaWeb.sort;

public class sorter {
	private String sortName;
	private String sortBy;

	public sorter(String sortName, String sortBy) {
		super();
		this.sortName = sortName;
		this.sortBy = sortBy;
	}

	public String getSortName() {
		return sortName;
	}

	public void setSortName(String sortName) {
		this.sortName = sortName;
	}

	public String getSortBy() {
		return sortBy;
	}

	public void setSortBy(String sortBy) {
		this.sortBy = sortBy;
	}
	
	

}

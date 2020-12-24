package com.laptrinhJavaWeb.model;

public class newsModel extends abstractModel<newsModel> {

	private String title;
	private String thumbnail;
	private String shortDescription;
	private String content;
	private Long categoriesId;


	

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getThumbnail() {
		return thumbnail;
	}

	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}

	public String getShortDescription() {
		return shortDescription;
	}

	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Long getCategoriesId() {
		return categoriesId;
	}

	public void setCategoriesId(Long categoriesId) {
		this.categoriesId = categoriesId;
	}

}

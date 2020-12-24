package com.laptrinhJavaWeb.model;

public class commenModel extends abstractModel<commenModel> {
	private String content;
	private Long userId;
	private Long newsId;

	public commenModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public commenModel(String content, Long userId, Long newsId) {
		super();
		this.content = content;
		this.userId = userId;
		this.newsId = newsId;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getNewsId() {
		return newsId;
	}

	public void setNewsId(Long newsId) {
		this.newsId = newsId;
	}

}

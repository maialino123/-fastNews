package com.laptrinhJavaWeb.model;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class abstractModel<T> {
	private Long id;
	private Timestamp createdDate;
	private Timestamp modifiedDate;
	private String crreatedBy;
	private String modifiedBy;
	private long[] ids;
	private List<T> data = new ArrayList<>();
	private Integer page;
	private Integer maxPage;
	private Integer totalPage;
	private Integer totalItem;
	private String sortName;
	private String sortBy;

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

	public int getTotalItem() {
		return totalItem;
	}

	public void setTotalItem(Integer totalItem) {
		this.totalItem = totalItem;
	}

	public Integer getPage() {
		return page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

	public Integer getMaxPage() {
		return maxPage;
	}

	public void setMaxPage(Integer maxPage) {
		this.maxPage = maxPage;
	}

	public Integer getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(Integer totalPage) {
		this.totalPage = totalPage;
	}

	public List<T> getData() {
		return data;
	}

	public void setData(List<T> data) {
		this.data = data;
	}

	public long[] getIds() {
		return ids;
	}

	public void setIds(long[] ids) {
		this.ids = ids;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Timestamp getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Timestamp createdDate) {
		this.createdDate = createdDate;
	}

	public Timestamp getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(Timestamp modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getCrreatedBy() {
		return crreatedBy;
	}

	public void setCrreatedBy(String crreatedBy) {
		this.crreatedBy = crreatedBy;
	}

	public String getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}
}

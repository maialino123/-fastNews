package com.laptrinhJavaWeb.paging;

import com.laptrinhJavaWeb.sort.sorter;

public class pageRequest implements pageble {
	
	private Integer page;
	private Integer maxPage;
	private sorter sort;

	public pageRequest(Integer page, Integer maxPage, sorter sort) {
		super();
		this.page = page;
		this.maxPage = maxPage;
		this.sort = sort;
	}

	@Override
	public Integer getPage() {
		return this.page;
	}

	@Override
	public Integer getLimit() {
		return this.maxPage;
	}

	@Override
	public Integer getOffset() {
		if (this.page != null && this.maxPage != null) {
			return (this.page - 1) * this.maxPage;
		}
		return null;
	}

	@Override
	public sorter getSorter() {
		if (this.sort != null) {
			return this.sort;
		}
		return null;
	}

}

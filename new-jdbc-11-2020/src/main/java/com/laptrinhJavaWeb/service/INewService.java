package com.laptrinhJavaWeb.service;

import java.util.List;

import com.laptrinhJavaWeb.model.newsModel;
import com.laptrinhJavaWeb.paging.pageble;

public interface INewService {
	List<newsModel> findByCategoryId(Long categoryId);

	newsModel save(newsModel newsModel);

	newsModel update(newsModel updateNew);

	void delete(long[] ids);

	List<newsModel> findAll(pageble pageble);
	
	int getTotalItem();
}

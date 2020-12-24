package com.laptrinhJavaWeb.dao;

import java.util.List;

import com.laptrinhJavaWeb.model.newsModel;
import com.laptrinhJavaWeb.paging.pageble;

public interface InewDAO extends GenericDAO<newsModel> {
	newsModel findone(Long id);
	List<newsModel> findByCategoryId(Long categoryId);
	Long save(newsModel newsModel);
	void update(newsModel updateNew);
	void delete(long id);
	List<newsModel> findAll(pageble pageble);
	int getTotalItem();
	
}

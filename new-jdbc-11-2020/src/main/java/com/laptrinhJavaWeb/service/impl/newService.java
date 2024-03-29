package com.laptrinhJavaWeb.service.impl;

import java.sql.Timestamp;
import java.util.List;

import javax.inject.Inject;

import com.laptrinhJavaWeb.dao.InewDAO;
import com.laptrinhJavaWeb.model.newsModel;
import com.laptrinhJavaWeb.paging.pageble;
import com.laptrinhJavaWeb.service.INewService;

public class newService implements INewService {
	
	
	@Inject private InewDAO newsDAO;

	@Override
	public List<newsModel> findByCategoryId(Long categoryId) {
	  return newsDAO.findByCategoryId(categoryId);
	}

	@Override
	public newsModel save(newsModel newsModel) {
		newsModel.setCreatedDate(new Timestamp(System.currentTimeMillis()));
		newsModel.setCrreatedBy("");
		Long newId = newsDAO.save(newsModel);
		return newsDAO.findone(newId);
	}

	@Override
	public newsModel update(newsModel updateNew) {
		newsModel oldNew = newsDAO.findone(updateNew.getId());
		updateNew.setCreatedDate(oldNew.getCreatedDate());
		updateNew.setCrreatedBy(oldNew.getCrreatedBy());
		updateNew.setModifiedDate(new Timestamp(System.currentTimeMillis()));
		updateNew.setModifiedBy("");
		newsDAO.update(updateNew);
		return newsDAO.findone(updateNew.getId());
		
	}

	@Override
	public void delete(long[] ids) {
		for (long l : ids) {
			newsDAO.delete(l);
		}
		
	}

	@Override
	public List<newsModel> findAll(pageble pageble) {
		return newsDAO.findAll(pageble);
	}

	@Override
	public int getTotalItem() {
		return newsDAO.getTotalItem();
	}

	
		

}

package com.laptrinhJavaWeb.service.impl;

import java.util.List;

import javax.inject.Inject;

import com.laptrinhJavaWeb.dao.IcategoryDAO;
import com.laptrinhJavaWeb.model.categoriesModel;
import com.laptrinhJavaWeb.service.ICategoryService;

public class categoryService implements ICategoryService {
	
	
	@Inject
	private IcategoryDAO categoryDao;
	

	@Override
	public List<categoriesModel> findAll() {
		return categoryDao.findAll();
	}


	@Override
	public categoriesModel save(categoriesModel category) {
		// TODO Auto-generated method stub
		Long newId = categoryDao.insert(category);
		return categoryDao.findOne(newId);
	}


	@Override
	public categoriesModel update(categoriesModel category) {
		// TODO Auto-generated method stub
		categoriesModel oldcate = categoryDao.findOne(category.getId());
		category.setCreatedDate(oldcate.getCreatedDate());
		category.setCrreatedBy(oldcate.getCrreatedBy());
		categoryDao.update(category);
		return categoryDao.findOne(category.getId());
		
	}

}

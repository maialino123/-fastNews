package com.laptrinhJavaWeb.dao.impl;

import java.util.List;

import com.laptrinhJavaWeb.dao.IcategoryDAO;
import com.laptrinhJavaWeb.mapper.CategoryMapper;
import com.laptrinhJavaWeb.model.categoriesModel;

public class categoryDAO extends AbstrachDAO<categoriesModel> implements IcategoryDAO {

	private static categoryDAO instance = null;

	public static categoryDAO getInstance() {
		if (instance == null) {
			instance = new categoryDAO();
		}
		return instance;
	}

	private categoryDAO() {
		
	}

	

	@Override
	public List<categoriesModel> findAll() {
		String sql = "select * from Categories";
		return query(sql.toString(), new CategoryMapper());

	}

	@Override
	public Long insert(categoriesModel cate) {
		// TODO Auto-generated method stub
		String sql = "insert into categories(name , code) values(?,?)";
		return insert(sql.toString(), cate.getName() , cate.getCode());
	}

	@Override
	public void update(categoriesModel cate) {
		// TODO Auto-generated method stub
		String sql = "update categories set name = ?,code=? where id = ?";
		update(sql.toString(), cate.getName(),cate.getCode(),cate.getId());
		
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		String sql = "delete from categories where id = ?";
		update(sql.toString(), id);
	}

	@Override
	public categoriesModel findOne(Long id) {
		// TODO Auto-generated method stub
		String sql = "select * from categories where id = ?"; 
		List<categoriesModel> cate = query(sql, new CategoryMapper() , id);
		return cate.isEmpty()?null:cate.get(0);
	}

}

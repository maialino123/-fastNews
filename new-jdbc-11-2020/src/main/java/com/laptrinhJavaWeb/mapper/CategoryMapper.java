package com.laptrinhJavaWeb.mapper;

import java.sql.ResultSet;

import com.laptrinhJavaWeb.model.categoriesModel;

public class CategoryMapper implements RowMapper<categoriesModel> {

	@Override
	public categoriesModel mapRow(ResultSet rs) {
		try {
			categoriesModel cate = new categoriesModel();
			cate.setId(rs.getLong("id"));
			cate.setName(rs.getString("name"));
			cate.setCode(rs.getString("code"));
			
			return cate;
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}
	}
    
}

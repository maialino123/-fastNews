package com.laptrinhJavaWeb.mapper;

import java.sql.ResultSet;

import com.laptrinhJavaWeb.model.newsModel;

public class NewMapper implements RowMapper<newsModel> {

	@Override
	public newsModel mapRow(ResultSet rs) {
		try {
			newsModel news = new newsModel();
			news.setId(rs.getLong("id"));
			news.setTitle(rs.getString("title"));
			news.setThumbnail(rs.getString("thumbnail"));
			news.setShortDescription(rs.getString("shortDescription"));
			news.setContent(rs.getString("content"));
			news.setCategoriesId(rs.getLong("CategoriesId"));
			news.setCreatedDate(rs.getTimestamp("createddate"));
			news.setCrreatedBy(rs.getString("createdby"));
			if (rs.getTimestamp("modifieddate") != null) {
				news.setModifiedDate(rs.getTimestamp("modifieddate"));
			}
			if (rs.getString("modifiedby") != null) {
				news.setModifiedBy(rs.getString("modifiedby"));
			}
			return news;
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}

	}

}

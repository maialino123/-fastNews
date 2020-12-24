package com.laptrinhJavaWeb.dao;

import java.util.List;

import com.laptrinhJavaWeb.model.categoriesModel;

public interface IcategoryDAO  extends GenericDAO<categoriesModel>{
  List<categoriesModel> findAll();
  Long insert(categoriesModel cate);
  void update(categoriesModel cate);
  void delete(Long id);
  categoriesModel findOne(Long id);
}

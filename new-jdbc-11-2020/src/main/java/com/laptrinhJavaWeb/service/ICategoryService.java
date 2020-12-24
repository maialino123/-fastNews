package com.laptrinhJavaWeb.service;

import java.util.List;

import com.laptrinhJavaWeb.model.categoriesModel;

public interface ICategoryService {
    List<categoriesModel> findAll();
    categoriesModel save(categoriesModel category);
    categoriesModel update(categoriesModel category);
}

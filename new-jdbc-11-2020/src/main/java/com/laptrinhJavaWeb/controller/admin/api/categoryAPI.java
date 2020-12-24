package com.laptrinhJavaWeb.controller.admin.api;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.laptrinhJavaWeb.model.categoriesModel;
import com.laptrinhJavaWeb.service.ICategoryService;
import com.laptrinhJavaWeb.utils.HttpUtils;

@WebServlet(urlPatterns = { "/api-admin-category" })
public class categoryAPI extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4994807117498056543L;
	@Inject
	private ICategoryService categoryService;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		req.setCharacterEncoding("UTF-8");
		resp.setContentType("application/json");
		categoriesModel categoriesModel = HttpUtils.of(req.getReader()).toModels(categoriesModel.class);
		categoriesModel = categoryService.save(categoriesModel);
		mapper.writeValue(resp.getOutputStream(), categoriesModel);
	}

	@Override
	protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		req.setCharacterEncoding("UTF-8");
		resp.setContentType("application/json");
		categoriesModel categoriesModel = HttpUtils.of(req.getReader()).toModels(categoriesModel.class);
		categoriesModel = categoryService.update(categoriesModel);
		mapper.writeValue(resp.getOutputStream(), categoriesModel);
	}

	@Override
	protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	}

}

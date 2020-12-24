package com.laptrinhJavaWeb.controller.admin.api;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.laptrinhJavaWeb.model.newsModel;
import com.laptrinhJavaWeb.service.INewService;
import com.laptrinhJavaWeb.utils.HttpUtils;


@WebServlet(urlPatterns = {"/api-admin-new"})
public class NewAPI extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Inject 
	private INewService newService;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		req.setCharacterEncoding("UTF-8");
		resp.setContentType("application/json");
		newsModel newsModel =  HttpUtils.of(req.getReader()).toModels(newsModel.class);
		newsModel = newService.save(newsModel);
		mapper.writeValue(resp.getOutputStream(), newsModel);
	}

	@Override
	protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		req.setCharacterEncoding("UTF-8");
		resp.setContentType("application/json");
		newsModel updateNew = HttpUtils.of(req.getReader()).toModels(newsModel.class);
		updateNew = newService.update(updateNew);
		mapper.writeValue(resp.getOutputStream(), updateNew);
	}

	@Override
	protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ObjectMapper ob = new ObjectMapper();
		req.setCharacterEncoding("UTF-8");
		resp.setContentType("application/json");
		newsModel deleteNews = HttpUtils.of(req.getReader()).toModels(newsModel.class);
		newService.delete(deleteNews.getIds());
		ob.writeValue(resp.getOutputStream(), "{}");
	}
	
	
	
	
   
}

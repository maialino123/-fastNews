package com.laptrinhJavaWeb.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.laptrinhJavaWeb.constant.SystemConstant;
import com.laptrinhJavaWeb.model.usersModel;
import com.laptrinhJavaWeb.utils.sessionUtil;

public class authorization implements Filter {
	private ServletContext context;

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		this.context = filterConfig.getServletContext();
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse resp = (HttpServletResponse) response;
		String url = req.getRequestURI();
		if (url.startsWith("/new-jdbc-11-2020/admin") || url.startsWith("/admin")) {
			usersModel usersModel = (usersModel) sessionUtil.getInstance().getValue(req, SystemConstant.USERMODEL);
			if (usersModel != null && usersModel.getRole().getCode()!= null) {
				if (usersModel.getRole().getCode().equals(SystemConstant.ADMIN)) {
					chain.doFilter(request, response);
				} else if(usersModel.getRole().getCode().equals(SystemConstant.USER)) {
					sessionUtil.getInstance().removeValue(req, SystemConstant.USERMODEL);
					resp.sendRedirect(req.getContextPath()+"/dang-nhap?action=login&message=not_permission&alert=danger");
				}
			} else {
				resp.sendRedirect(req.getContextPath()+"/dang-nhap?action=login&message=not_login&alert=danger");
			}
		} else {
			chain.doFilter(request, response);
		}
		
	}

	@Override
	public void destroy() {
		
	}

}

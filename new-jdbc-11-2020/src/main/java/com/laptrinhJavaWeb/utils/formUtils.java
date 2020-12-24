package com.laptrinhJavaWeb.utils;

import java.lang.reflect.InvocationTargetException;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.beanutils.BeanUtils;

public class formUtils {
	@SuppressWarnings("unchecked")
	public static final <T> T toModel(Class<T> clazz, HttpServletRequest req) {
		T object = null;
		try {
			object = clazz.newInstance();
			BeanUtils.populate(object, req.getParameterMap());
		} catch (InstantiationException | IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return object;
	}
}

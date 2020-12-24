package com.laptrinhJavaWeb.utils;

import java.io.BufferedReader;
import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;

public class HttpUtils {
	private String value;

	public HttpUtils(String value) {
      this.value = value;
	}
	
	public <T> T toModels(Class<T> tClass) {
		try {
			return new ObjectMapper().readValue(value, tClass);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public static HttpUtils of(BufferedReader reader) {
		StringBuilder sb = new StringBuilder();
		try {
			String line;
			while ((line = reader.readLine()) != null) {
				sb.append(line);
			}
		} catch (IOException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
			
		}
		return new HttpUtils(sb.toString());
	}
}

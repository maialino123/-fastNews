package com.laptrinhJavaWeb.mapper;

import java.sql.ResultSet;

public interface RowMapper<T> {
 T mapRow(ResultSet rs);
}

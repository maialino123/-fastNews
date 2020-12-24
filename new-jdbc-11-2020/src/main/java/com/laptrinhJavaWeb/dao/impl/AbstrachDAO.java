package com.laptrinhJavaWeb.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import com.laptrinhJavaWeb.dao.GenericDAO;
import com.laptrinhJavaWeb.mapper.RowMapper;

public class AbstrachDAO<T> implements GenericDAO<T> {
	ResourceBundle resourceBundle = ResourceBundle.getBundle("db");
	public Connection getConnection() {
		try {
			Class.forName(resourceBundle.getString("driverName"));
			String url = resourceBundle.getString("url");
			String user = resourceBundle.getString("user");
			String password = resourceBundle.getString("password");
			return DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}

	}

	@Override
	public <T> List<T> query(String sql, RowMapper<T> rowMapper, Object... parameters) {
		List<T> list = new ArrayList<T>();
		Connection conn = null;
		PreparedStatement stm = null;
		ResultSet rs = null;
		try {
			conn = getConnection();
			stm = conn.prepareStatement(sql);
			setParameter(stm, parameters);
			rs = stm.executeQuery();
			while (rs.next()) {
				list.add(rowMapper.mapRow(rs));
			}
			return list;
		} catch (SQLException e) {
			// TODO: handle exception
			return null;
		} finally {
			try {
				if (conn != null) {
					conn.close();
				}

				if (stm != null) {
					stm.close();
				}

				if (rs != null) {
					rs.close();
				}
			} catch (Exception e2) {
				// TODO: handle exception
				return null;
			}
		}

	}

	private void setParameter(PreparedStatement stm, Object[] parameters) {
		// TODO Auto-generated method stub
		try {
			for (int i = 0; i < parameters.length; i++) {
				Object parameter = parameters[i];
				int index = i + 1;
				if (parameter instanceof Long) {
					stm.setLong(index, (long) parameter);
				} else if (parameter instanceof String) {
					stm.setString(index, (String) parameter);
				} else if (parameter instanceof Integer) {
					stm.setInt(index, (int) parameter);
				} else if (parameter instanceof Float) {
					stm.setFloat(index, (float) parameter);
				} else if (parameter instanceof Boolean) {
					stm.setBoolean(index, (boolean) parameter);
				} else if (parameter instanceof Double) {
					stm.setDouble(index, (double) parameter);
				} else if (parameter instanceof Byte) {
					stm.setByte(index, (byte) parameter);
				} else if (parameter instanceof Short) {
					stm.setShort(index, (short) parameter);
				} else if (parameter instanceof Timestamp) {
					stm.setTimestamp(index, (Timestamp) parameter);
				}
			}
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

	@Override
	public void update(String sql, Object... parameters) {
		// TODO Auto-generated method stub
		Connection conn = null;
	    PreparedStatement stm = null;
	    try {
			conn  = getConnection();
		    conn.setAutoCommit(false);
		    stm = conn.prepareStatement(sql);
		    setParameter(stm, parameters);
		    stm.executeUpdate();
		    conn.commit();
		} catch (SQLException e) {
			// TODO: handle exception
			try {
				conn.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		    e.printStackTrace();
		    
		} finally {
			try {
				if (conn != null) {
					conn.close();
				}

				if (stm != null) {
					stm.close();
				}

			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
		
	}

	@Override
	public Long insert(String sql, Object... parameters) {
		// TODO Auto-generated method stub
		Connection conn = null;
		PreparedStatement stm = null;
		ResultSet rs = null;
		Long id = null;
		try {
			conn = getConnection();
			stm = conn.prepareStatement(sql, stm.RETURN_GENERATED_KEYS);
			conn.setAutoCommit(false);
			setParameter(stm, parameters);
			stm.executeUpdate();
			rs = stm.getGeneratedKeys();
			if (rs.next()) {
				id = rs.getLong(1);
			}
			conn.commit();
			return id;
			
		} catch (SQLException e) {
			// TODO: handle exception
			try {
				conn.rollback();
			} catch (SQLException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
			try {
				conn.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			e.printStackTrace();
			return null;
		} finally {
			try {
				if (conn != null) {
					conn.close();
				}

				if (stm != null) {
					stm.close();
				}

				if (rs != null) {
					rs.close();
				}
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
				return null;
			}
		}
	
	}

	@Override
	public int queryCount(String sql, Object... parameters) {
		Connection conn = null;
		PreparedStatement stm = null;
		ResultSet rs = null;
		int count = 0;
		try {
			conn = getConnection();
			stm = conn.prepareStatement(sql);
			rs = stm.executeQuery();
			if (rs.next()) {
				count = rs.getInt("count(*)");
			}
			return count;
		} catch (SQLException e) {
			e.printStackTrace();
			return 0;
		} finally {
			try {
				if (conn != null) {
					conn.close();
				}
				if (stm != null) {
					stm.close();
				}
				if (rs != null) {
					rs.close();
				}
			} catch (SQLException  e2) {
				e2.printStackTrace();
				return 0;
			}
		}
	
	}

	
}

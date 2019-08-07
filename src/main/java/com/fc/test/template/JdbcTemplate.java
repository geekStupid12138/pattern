package com.fc.test.template;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author lize
 * @date 7/14/19 5:43 PM
 * 模板模式由抽象类实现 定义好具体流程 由子类实现自定义部分， 规定流程，修改部分
 */
public abstract class JdbcTemplate {

	public Object query(String sql, Class<?> pojo) throws SQLException {
		Connection conn = getConnection();
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.execute();
		return handlResultSet(ps.getResultSet(), pojo);
	}

	private Connection getConnection() {
		return null;
	}

	protected abstract Object handlResultSet(ResultSet rs, Class<?> pojo) ;

}

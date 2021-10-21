package net.daum.DAO;

import java.sql.Connection;

import java.sql.SQLException;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

public class HikariConnector {
	
	public Connection getConnection() {
		HikariConfig config = new HikariConfig();
//		config.setDriverClassName("oracle.jdbc.driver.OracleDriver");
		config.setJdbcUrl("jdbc:oracle:thin:@localhost:1521/XEPDB1");
		config.setUsername("hr");
		config.setPassword("1234");
		config.addDataSourceProperty("cachePrepStmts", "true");
		config.addDataSourceProperty("prepStmtCacheSize", "250");
		config.addDataSourceProperty("prepStmtCacheSqlLimit", "2048");

		HikariDataSource ds = new HikariDataSource(config);
		
		try {
			return ds.getConnection();
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
}

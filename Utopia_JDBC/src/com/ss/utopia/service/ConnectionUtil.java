package com.ss.utopia.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtil {
	private static final String driver= "com.mysql.cj.jdbc.Driver";
	private static final String url= "jdbc:mysql://localhost:3306/utopia";
	private static final String username= "root";
	private static final String password= "Ep5zXAhdb6Jnkp2W";

	public Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName(driver);
		Connection conn = DriverManager.getConnection(url, username, password);
		conn.setAutoCommit(Boolean.FALSE);
		return conn;
	}
}

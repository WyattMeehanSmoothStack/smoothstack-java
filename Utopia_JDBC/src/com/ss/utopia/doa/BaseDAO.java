/**
 * 
 */
package com.ss.utopia.doa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @author meeha
 *
 */
public abstract class BaseDAO {

	private String driver = "com.mysql.cj.jdbc.Driver";
	private String url = "jdbc:mysql://localhost:3306/utopia";
	private String username = "root";
	private String password = "Ep5zXAhdb6Jnkp2W";
	
	public Connection getConnection() throws SQLException, ClassNotFoundException {
		Class.forName(driver);
		Connection conn = DriverManager.getConnection(url, username, password);
		return conn;
	}
	
	public void save(String sql, Object[] vals) throws SQLException, ClassNotFoundException {
		PreparedStatement prep = getConnection().prepareStatement(sql);
		if(vals!=null) {
			int ct = 1;
			for(Object o : vals) {
				prep.setObject(ct, o);
				ct++;
			}
		}
		prep.executeUpdate();
	}
	

}


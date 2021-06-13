/**
 * 
 */
package com.ss.utopia.doa;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

/**
 * @author meeha
 *
 */
public abstract class BaseDAO<T> {

	public Connection conn = null;

	public BaseDAO(Connection conn) {
		this.conn = conn;
	}
	public void save(String sql, Object[] vals) throws SQLException, ClassNotFoundException {
		PreparedStatement prep = conn.prepareStatement(sql);
		if(vals!=null) {
			int ct = 1;
			for(Object o : vals) {
				prep.setObject(ct, o);
				ct++;
			}
		}
		prep.executeUpdate();
	}
	
	public Integer saveWithPk(String sql, Object[] vals) throws ClassNotFoundException, SQLException {
		PreparedStatement pstmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
		if (vals != null) {
			int ct = 1;
			for (Object o : vals) {
				pstmt.setObject(ct, o);
				ct++;
			}
		}
		pstmt.executeUpdate();
		ResultSet rs = pstmt.getGeneratedKeys();

		if (rs.next()) {
			return rs.getInt(1);
		}
		return null;
	}
	
	public List<T> read(String sql, Object[] vals) throws ClassNotFoundException, SQLException {
		PreparedStatement pstmt = conn.prepareStatement(sql);
		if (vals != null) {
			int ct = 1;
			for (Object o : vals) {
				pstmt.setObject(ct, o);
				ct++;
			}
		}
		ResultSet rs = pstmt.executeQuery();
		return extractData(rs);
	}

	public abstract List<T> extractData(ResultSet rs) throws ClassNotFoundException, SQLException;

}


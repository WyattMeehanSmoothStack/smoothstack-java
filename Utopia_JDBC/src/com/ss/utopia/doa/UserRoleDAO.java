/**
 * 
 */
package com.ss.utopia.doa;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.ss.utopia.domain.UserRole;

/**
 * @author Wyatt Meehan
 *
 */
public class UserRoleDAO extends BaseDAO<UserRole>{

	/**
	 * @param conn
	 */
	public UserRoleDAO(Connection conn) {
		super(conn);
	}
	
	public void addUserRole(UserRole userR) throws ClassNotFoundException, SQLException {
		saveWithPk("insert into user_role (name) values (?)", new Object[] {userR.getName()});
	}
	
	public void updateUserRole(UserRole userR) throws ClassNotFoundException, SQLException {
		save("update user_role set name = ? where id = ?", new Object[] {userR.getName(), userR.getId()});
	}
	
	public void deleteUserRole(UserRole userR)  throws ClassNotFoundException, SQLException {
		save("delete from user_role where id = ?", new Object[] {userR.getId()});
	}
	
	public UserRole readUserRole(Integer userRole) throws ClassNotFoundException, SQLException {
		List<UserRole> userR = read("select id from user_role where id = ?", new Object[] {userRole});
		if (userR.size() < 1) {
			return null;
		}
		return userR.get(0);
	}

	@Override
	public List<UserRole> extractData(ResultSet rs) throws ClassNotFoundException, SQLException {
		return null;
	}

}

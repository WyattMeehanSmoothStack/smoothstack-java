/**
 * 
 */
package com.ss.utopia.doa;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ss.utopia.domain.User;

/**
 * @author Wyatt Meehan
 *
 */
public class UserDAO extends BaseDAO<User> {

	/**
	 * @param conn
	 */
	public UserDAO(Connection conn) {
		super(conn);
	}

	public int addUser(User user) throws ClassNotFoundException, SQLException {
		return saveWithPk(
				"insert into user (role_id, given_name, family_name, username,  "
						+ "email, password, phone) values ( ?, ?, ?, ?, ?, ?, ?)",
				new Object[] { user.getUserRole().getId(), user.getGivenName(), user.getFamilyName(),
						user.getUserName(), user.getEmail(), user.getPassword(), user.getPhone() });
	}

	public void updateUser(User user) throws ClassNotFoundException, SQLException {
		save("update user set role_id = ?, given_name = ?, family_name = ?, username = ?,"
				+ "email = ?, password = ?, phone = ? where id = ?",
				new Object[] { user.getUserRole().getId(), user.getGivenName(), user.getFamilyName(),
						user.getUserName(), user.getEmail(), user.getPassword(), user.getPhone(), user.getId() });
	}

	public void deleteUser(User user) throws ClassNotFoundException, SQLException {
		save("delete from user where id = ?", new Object[] { user.getId()});
	}
	
	public List<User> readAllUsers() throws ClassNotFoundException, SQLException {
		return read("select * from user", null);
		
	}
	
	public User readUserById(int id) throws ClassNotFoundException, SQLException {
		List<User> users = readAllUsers();
		for(User u : users) {
			if(u.getId() == id) {
				return u;
			}
		} return null;
	}
	
	@Override
	public List<User> extractData(ResultSet rs) throws ClassNotFoundException, SQLException {
		UserRoleDAO us = new UserRoleDAO(conn);
		List<User> users = new ArrayList<>();
		while(rs.next()) {
			User user = new User();
			user.setId(rs.getInt("id"));
			user.setUserRole(us.readUserRole(rs.getInt("id")));
			user.setGivenName(rs.getString("given_name"));
			user.setFamilyName(rs.getString("family_name"));
			user.setUserName("username");
			user.setEmail(rs.getString("email"));
			user.setPassword(rs.getString("password"));
			user.setPhone(rs.getString("phone"));
			users.add(user);
		}
		return users;
	}

}

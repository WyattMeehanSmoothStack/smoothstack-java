/**
 * 
 */
package com.ss.utopia.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import com.ss.utopia.doa.RouteDAO;
import com.ss.utopia.domain.Route;

/**
 * @author meeha
 *
 */
public class AdminService {
	
	ConnectionUtil connUtil = new ConnectionUtil();

	public void addRoute(Route route) throws SQLException {
//		Connection conn = null;
//		try {
//			conn = connUtil.getConnection();
//			RouteDAO rdao = new RouteDAO(conn);
//
//			conn.commit();
//		} catch (Exception e) {
//			conn.rollback();
//		} finally {
//			conn.close();
//		}
	}
	
	public List<Route> readRoutes() throws SQLException, ClassNotFoundException {
		Connection conn = null;
		try {
			conn = connUtil.getConnection();
			RouteDAO rdao = new RouteDAO(conn);
			List<Route> routes = rdao.readAllRoutes();
			return routes;
		
		} finally {
			conn.close();
		}
	}


}

/**
 * 
 */
package com.ss.utopia.doa;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.ss.utopia.domain.Route;

/**
 * @author meeha
 *
 */
public class RouteDAO extends BaseDAO {

	public void addRoute(Route route) throws ClassNotFoundException, SQLException  {
		save("insert into route (?, ?)", new Object[] {route.getOriginAirort().getAirportID(), route.getDestAirport().getAirportID()});
	}

	public void updateRoute(Route route) throws ClassNotFoundException, SQLException  {

	}

	public void deleteRoute(Route route) throws ClassNotFoundException, SQLException  {

	}

	public List<Route> readAllRoutes(Route route) throws ClassNotFoundException, SQLException {
		List<Route> routes = new ArrayList<>();
		
		PreparedStatement prep = getConnection().prepareStatement("select * from route");
		
		ResultSet rs = prep.executeQuery();
		while(rs.next()) {
			System.out.println(rs.getInt("id"));
		}

		return routes;
	}

}

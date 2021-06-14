/**
 * 
 */
package com.ss.utopia.doa;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ss.utopia.domain.Route;

/**
 * @author meeha
 *
 */
public class RouteDAO extends BaseDAO<Route> {

	/**
	 * @param conn
	 */
	public RouteDAO(Connection conn) {
		super(conn);
	}

	public void addRoute(Route route) throws ClassNotFoundException, SQLException  {
		saveWithPk("insert into route (origin_id, destination_id) values (?, ?)", new Object[] {route.getOriginAirport().getAirportID(), route.getDestAirport().getAirportID()});
	}

	public void updateRoute(Route route) throws ClassNotFoundException, SQLException {
		save("update route set origin_id = ? " + ", destination_id = ? where id = ?",
				new Object[] { route.getOriginAirport().getAirportID(),
						route.getDestAirport().getAirportID(), route.getRouteID() });
	}

	public void deleteRoute(Route route) throws ClassNotFoundException, SQLException {
		save("delete from route where id = ?", new Object[] { route.getRouteID() });
	}

	public List<Route> readAllRoutes() throws ClassNotFoundException, SQLException {
		return read("select * from route", null);
	}
	
	public List<Route> readRoutesByAirportCode(String airportCode) throws ClassNotFoundException, SQLException {
		return read("select * from route where destination_id = ? or origin_id = ?", new Object[] {airportCode, airportCode});
	}

	public List<Route> extractData(ResultSet rs) throws ClassNotFoundException, SQLException {
		AirportDAO aDao = new AirportDAO(conn);
		List<Route> routes = new ArrayList<>();
		while (rs.next()) {
			Route route = new Route();
			route.setRouteID(rs.getInt("id"));
			route.setOriginAirport(aDao.readAirportId(rs.getString("origin_id")));
			route.setDestAirport(aDao.readAirportId(rs.getString("destination_id")));
			routes.add(route);
		}
		return routes;
	}

}

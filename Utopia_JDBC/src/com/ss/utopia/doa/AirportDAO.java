/**
 * 
 */
package com.ss.utopia.doa;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ss.utopia.domain.Airport;


/**
 * @author meeha
 *
 */
public class AirportDAO extends BaseDAO<Airport> {

	/**
	 * @param conn
	 */
	public AirportDAO(Connection conn) {
		super(conn);

	}
	
	public void addAirport(Airport airport) throws ClassNotFoundException, SQLException  {
		save("insert into airport (?, ?)", new Object[] {airport.getAirportID(), airport.getCity()});
	}

	public void updateAirport(Airport airport) throws ClassNotFoundException, SQLException {
		save("update airport set iata_id = ? " + "and city = ? where iata_id = ?",
				new Object[] { airport.getAirportID(),
						airport.getCity(), airport.getAirportID() });
	}

	public void deleteRoute(Airport airport) throws ClassNotFoundException, SQLException {
		save("delete from route where id = ?", new Object[] { airport.getAirportID() });
	}

	public List<Airport> readAllRoutes() throws ClassNotFoundException, SQLException {
		return read("select * from airport", null);
	}
	
	public Airport readAirportId(String airportCode) throws ClassNotFoundException, SQLException {
		List<Airport> airports = read("select * from airport where iata_id = ?", new Object[] { airportCode });
		if (airports.size() < 1) {
			return null;
		}
		return airports.get(0);
	}
	

	@Override
	public List<Airport> extractData(ResultSet rs) throws ClassNotFoundException, SQLException {
		List<Airport> airports = new ArrayList<>();
		while (rs.next()) {
			Airport airport = new Airport();
			airport.setAirportID(rs.getString("iata_id"));
			airport.setCity(rs.getString("city"));
			// circular dependency issue
			// airport.setRoutes(rdao.readRoutesByAirportCode(airport.getAirportCode()));
			airports.add(airport);
		}
		return airports;
	}


}

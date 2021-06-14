/**
 * 
 */
package com.ss.utopia.doa;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ss.utopia.domain.Flight;
import com.ss.utopia.domain.Route;

/**
 * @author Wyatt Meehan
 *
 */
public class FlightDAO extends BaseDAO<Flight> {

	/**
	 * @param conn
	 */
	public FlightDAO(Connection conn) {
		super(conn);
	}
	
	public void addFlight(Flight flight)  throws ClassNotFoundException, SQLException  {
		saveWithPk("insert into flight (id, route_id, airplan_id, departure_time,"
				+ " reserved_seats, seat_price) values(?, ?, ?, ?, ?, ?)", new Object[] {flight.getId(),
				flight.getRoute(), flight.getAirplane(), flight.getDepartureTime(), flight.getReservedSeats(),
				flight.getSeatPrice()});
	}
	
	public void updateFlight(Flight flight, String code) throws ClassNotFoundException, SQLException {
		save("update flight set id = ? " + ", route_id = ? " + ", airplane_id = ? " + ", departure_time = ? " + ", reserved_seats = ? " 
				+ ", seat_price = ? where id = ?", new Object[] {flight.getId(), flight.getRoute(), 
						flight.getAirplane(), flight.getDepartureTime(), flight.getReservedSeats(), 
						flight.getSeatPrice(), code});
	}
	
	public void deleteFlight(Flight flight) throws ClassNotFoundException, SQLException {
		save("delete from flight where id = ?", new Object[] {flight.getId()});
	}
	
	public List<Flight> readAllFlights() throws ClassNotFoundException, SQLException {
		return read("select * from flight", null);
	}

	@Override
	public List<Flight> extractData(ResultSet rs) throws ClassNotFoundException, SQLException {
		List<Flight> flights = new ArrayList<>();
		while (rs.next()) {
			Flight flight = new Flight();
			flight.setId(rs.getInt("id"));
			flight.setRoute((Route) rs.getObject("route_id"));
			flight.setDepartureTime(rs.getDate("departure_time"));
			flight.setSeatPrice(rs.getFloat("seat_price"));
		}
		return flights;
	}

}

/**
 * 
 */
package com.ss.utopia.doa;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ss.utopia.domain.FlightBookings;

/**
 * @author Wyatt Meehan
 *
 */
public class FlightBookingsDAO extends BaseDAO<FlightBookings> {

	
	public FlightBookingsDAO(Connection conn) {
		super(conn);
	}
	
	public void addFlightBookings(FlightBookings fb) throws ClassNotFoundException, SQLException  {
		save("insert into fight_bookings (flight_id, booking_id) values(?, ?", 
				new Object[] {fb.getFlight().getId(), fb.getBooking().getId()});
	}
	
	public void updateFlightBookings(FlightBookings fb) throws ClassNotFoundException, SQLException {
		save("update flight_bookings set booking_id = ? where flight_id = ?", 
		new Object[] {fb.getBooking().getId(), fb.getFlight().getId()});
	}
	
	public void deleteFlightBookings(FlightBookings fb) throws ClassNotFoundException, SQLException {
		save("delete from flight_bookings where flight_id = ?", 
				new Object[] {fb.getFlight().getId()} );
	}

	@Override
	public List<FlightBookings> extractData(ResultSet rs) throws ClassNotFoundException, SQLException {
		BookingDAO book = new BookingDAO(conn);
		FlightDAO flight = new FlightDAO(conn);
		List<FlightBookings> fbS = new ArrayList<>();
		while(rs.next()) {
			FlightBookings fb = new FlightBookings();
			fb.setBooking(book.readBookingById(rs.getInt("booking_id")));
			fb.setFlight(flight.readFlightById(rs.getInt("flight_id")));
			fbS.add(fb);
		}
		return fbS;
	}

}
/**
 * 
 */
package com.ss.utopia.doa;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ss.utopia.domain.Booking;

/**
 * @author Wyatt Meehan
 *
 */
public class BookingDAO extends BaseDAO<Booking> {

	/**
	 * @param conn
	 */
	public BookingDAO(Connection conn) {
		super(conn);
	}

	public void addBooking(Booking booking) throws ClassNotFoundException, SQLException {
		save("insert into booking (id, is_active, confirmation_code) values (?, ?, ?)",
				new Object[] { booking.getId(), booking.getIsActive(), booking.getConfirmationCode() });
	}

	public void updateBooking(Booking booking) throws ClassNotFoundException, SQLException {
		save("update booking set is_active = ? " + ", confirmation_code = ? where id = ?",
				new Object[] { booking.getIsActive(), booking.getConfirmationCode(), booking.getId() });
	}

	public void deleteBooking(Booking booking) throws ClassNotFoundException, SQLException {
		save("delete from booking where id = ?", new Object[] { booking.getId() });
	}

	public List<Booking> readAllBookings() throws ClassNotFoundException, SQLException {
		return read("select * from booking", null);
	}

	@Override
	public List<Booking> extractData(ResultSet rs) throws ClassNotFoundException, SQLException {
		List<Booking> bookings = new ArrayList<>();
		while (rs.next()) {
			Booking booking = new Booking();
			booking.setId(rs.getInt("id"));
			booking.setIsActive(rs.getInt("is_active"));
			booking.setConfirmationCode(rs.getString("confirmation_code"));
			bookings.add(booking);
		}
		return bookings;
	}

	
	public Booking readBookingById(int id) throws ClassNotFoundException, SQLException {
		List<Booking> bookings = readAllBookings();
		for(Booking booking : bookings) {
			if(booking.getId() == id) {
				return booking;
			}
		}
		return null;
		
	}



}

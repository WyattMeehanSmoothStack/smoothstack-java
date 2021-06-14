/**
 * 
 */
package com.ss.utopia.doa;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ss.utopia.domain.BookingGuest;

/**
 * @author Wyatt Meehan
 *
 */
public class BookingGuestDAO extends BaseDAO<BookingGuest> {

	/**
	 * @param conn
	 */
	public BookingGuestDAO(Connection conn) {
		super(conn);
	}

	public void addBookingGuest(BookingGuest bookG) throws ClassNotFoundException, SQLException {
		save("insert into booking_guest (booking_id, contact_email, contact_phone) values(?, ?, ?)",
				new Object[] { bookG.getBooking(), bookG.getContactEmail(), bookG.getContactPhone() });
	}
	
	public void updateBookingGuest(BookingGuest bookG) throws ClassNotFoundException, SQLException {
		save("update booking_guest set contact_email = ?, contact_phone = ?, where booking_id = ?", 
				new Object[] {bookG.getContactEmail(), bookG.getContactPhone(), bookG.getBooking().getId()});
	}
	
	public void deleteBookingGuest(BookingGuest bookG) throws ClassNotFoundException, SQLException {
		save("delete from booking_guest where id = ?", new Object[] {bookG.getBooking().getId()});
	}

	@Override
	public List<BookingGuest> extractData(ResultSet rs) throws ClassNotFoundException, SQLException {
		BookingDAO bookD = new BookingDAO(conn); 
		List<BookingGuest> bookG = new ArrayList<>();
		while (rs.next()) {
			BookingGuest booker = new BookingGuest();
			booker.setBooking(bookD.readBookingById(rs.getInt("booking_id")));
			booker.setContactEmail(rs.getString("contact_email"));
			booker.setContactPhone(rs.getString("contact_phone"));
			bookG.add(booker);
		}
		return bookG;
	}

}

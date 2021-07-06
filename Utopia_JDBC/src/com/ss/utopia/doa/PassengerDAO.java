/**
 * 
 */
package com.ss.utopia.doa;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ss.utopia.domain.Passenger;

/**
 * @author Wyatt Meehan
 *
 */
public class PassengerDAO extends BaseDAO<Passenger> {

	/**
	 * @param conn
	 */
	public PassengerDAO(Connection conn) {
		super(conn);
	}

	public void addPassenger(Passenger pas) throws ClassNotFoundException, SQLException {
		saveWithPk("insert into passenger (booking_id, given_name, family_name, dob, gender, address) values (?, ?, ?, ?, ?, ?)", new Object[] {pas.getBooking(),
				pas.getGivenName(), pas.getFamilyName(), pas.getDob(), pas.getGender(), pas.getAddress() });
	}

	public void updatePassenger(Passenger passenger) throws ClassNotFoundException, SQLException {
		save("update passenger set given_name = ?, family_name = ?, dob = ?, gender = ?, address = ?",
				new Object[] { passenger.getGivenName(), passenger.getFamilyName(), passenger.getDob(),
						passenger.getGender(), passenger.getAddress() });

	}

	public void deletePassenger(Passenger passenger) throws ClassNotFoundException, SQLException {
		save("delete from passenger where id = ?", new Object[] { passenger.getId() });
	}

	public List<Passenger> readAllPassengers() throws ClassNotFoundException, SQLException {
		return read("select * from passenger", null);
	}

	public Passenger readPassengerId(String passId) throws ClassNotFoundException, SQLException {
		List<Passenger> passengers = read("select * from passenger where id = ?", new Object[] { passId });
		if (passengers.size() < 1) {
			return null;
		}
		return passengers.get(0);
	}

	public List<Passenger> extractData(ResultSet rs) throws ClassNotFoundException, SQLException {
		BookingDAO bdao = new BookingDAO(conn);
		List<Passenger> passengers = new ArrayList<>();
		while (rs.next()) {
			Passenger passenger = new Passenger();
			passenger.setId(rs.getInt("id"));
			passenger.setBooking(bdao.readBookingById(rs.getInt("booking_id")));
			passenger.setGivenName(rs.getString("given_name"));
			passenger.setFamilyName(rs.getString("family_name"));
			passenger.setDob(rs.getDate("dob"));
			passenger.setGender(rs.getString("gender"));
			passenger.setAddress(rs.getString("address"));
			passengers.add(passenger);
		}
		return passengers;
	}
}
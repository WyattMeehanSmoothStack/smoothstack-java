/**
 * 
 */
package com.ss.utopia.doa;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
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
		// TODO Auto-generated constructor stub
	}

	public void addPassenger(Passenger passenger) throws ClassNotFoundException, SQLException  {
		save("insert into passenger (?, ?, ?, ?, ?, ?, ?)", new Object[] {passenger.ge, airport.getCity()});
	}

	public void updatePassenger(Passenger airport) throws ClassNotFoundException, SQLException {
		save("update airport set iata_id = ? " + "and city = ? where iata_id = ?",
				new Object[] { airport.getAirportID(),
						airport.getCity(), airport.getAirportID() });
	}

	public void deletePassenger(Passenger passenger) throws ClassNotFoundException, SQLException {
		save("delete from route where id = ?", new Object[] { passenger.getPassengerID() });
	}

	public List<Passenger> readAllRoutes() throws ClassNotFoundException, SQLException {
		return read("select * from airport", null);
	}
	
	public Passenger readPassengerId(String passId) throws ClassNotFoundException, SQLException {
		List<Passenger> passengers = read("select * from passenger where id = ?", new Object[] { passId });
		if (passengers.size() < 1) {
			return null;
		}
		return passengers.get(0);
	}

	@Override
	public List<Passenger> extractData(ResultSet rs) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return null;
	}
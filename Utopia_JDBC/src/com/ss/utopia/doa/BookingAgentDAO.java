/**
 * 
 */
package com.ss.utopia.doa;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ss.utopia.domain.BookingAgent;

/**
 * @author Wyatt Meehan
 *
 */
public class BookingAgentDAO extends BaseDAO<BookingAgent> {

	/**
	 * @param conn
	 */
	public BookingAgentDAO(Connection conn) {
		super(conn);
	}
	
	public void addBookingAgent(BookingAgent ba) throws ClassNotFoundException, SQLException {
		saveWithPk("insert into booking_agent (booking_id, agent_id) values (?, ?)", 
				new Object[] {ba.getBooking().getId(), ba.getAgent().getId()});
	}
	
	public void updateBookingAgent(BookingAgent ba) throws ClassNotFoundException, SQLException {
		save("update booking_agent set agent_id = ? where id = ?", 
				new Object[] {ba.getAgent().getId(), ba.getBooking().getId()});
	}
	
	public void deleteBookingAgent(BookingAgent ba) throws ClassNotFoundException, SQLException {
		save("delete from booking_agent where booking_id = ?", new Object[] {ba.getBooking().getId()});
	}
	
	@Override
	public List<BookingAgent> extractData(ResultSet rs) throws ClassNotFoundException, SQLException {
		BookingDAO bDao = new BookingDAO(conn);
		UserDAO uDao = new UserDAO(conn);
		List<BookingAgent> baS = new ArrayList<>();
		while(rs.next()) {
			BookingAgent agent = new BookingAgent();
			agent.setAgent(uDao.readUserById(rs.getInt("agent_id")));
			agent.setBooking(bDao.readBookingById(rs.getInt("booking_id")));
			baS.add(agent);	
		}		
		return baS;
	}

}

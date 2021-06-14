/**
 * 
 */
package com.ss.utopia.domain;

/**
 * @author Wyatt Meehan
 *
 */
public class BookingAgent {

	private User agent;
	private Booking booking;
	
	
	
	/**
	 * @param agent
	 * @param booking
	 */
	public BookingAgent(User agent, Booking booking) {
		this.agent = agent;
		this.booking = booking;
	}
	
	/**
	 * @return the agent
	 */
	public User getAgent() {
		return agent;
	}
	/**
	 * @param agent the agent to set
	 */
	public void setAgent(User agent) {
		this.agent = agent;
	}
	/**
	 * @return the booking
	 */
	public Booking getBooking() {
		return booking;
	}
	/**
	 * @param booking the booking to set
	 */
	public void setBooking(Booking booking) {
		this.booking = booking;
	}


	
}

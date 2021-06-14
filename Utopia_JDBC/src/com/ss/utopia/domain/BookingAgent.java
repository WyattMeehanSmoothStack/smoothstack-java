/**
 * 
 */
package com.ss.utopia.domain;

/**
 * @author Wyatt Meehan
 *
 */
public class BookingAgent {

	private User user;
	private Booking booking;

	/**
	 * @param agent
	 * @param booking
	 */
	public BookingAgent(User agent, Booking booking) {
		this.user = agent;
		this.booking = booking;
	}

	/**
	 * @return the agent
	 */
	public User getAgent() {
		return user;
	}

	/**
	 * @param agent the agent to set
	 */
	public void setAgent(User agent) {
		this.user = agent;
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

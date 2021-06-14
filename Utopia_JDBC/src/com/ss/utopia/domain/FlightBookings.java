/**
 * 
 */
package com.ss.utopia.domain;

/**
 * @author Wyatt Meehan
 *
 */
public class FlightBookings {
	private Booking booking;
	private Flight flight;

	/**
	 * @param booking
	 * @param flight
	 */
	public FlightBookings(Booking booking, Flight flight) {
		this.booking = booking;
		this.flight = flight;
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

	/**
	 * @return the flight
	 */
	public Flight getFlight() {
		return flight;
	}

	/**
	 * @param flight the flight to set
	 */
	public void setFlight(Flight flight) {
		this.flight = flight;
	}

}

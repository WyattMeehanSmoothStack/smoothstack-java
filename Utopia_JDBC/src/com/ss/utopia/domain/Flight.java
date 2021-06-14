/**
 * 
 */
package com.ss.utopia.domain;

/**
 * @author meeha
 *
 */
public class Flight {
	private Integer id;
	private Route route;
	private Airplane airplane;
	private String departureTime;
	private Integer reservedSeats;
	private Float seatPrice;

	/**
	 * @param id
	 * @param route
	 * @param airplane
	 * @param departureTime
	 * @param reservedSeats
	 * @param seatPrice
	 */
	public Flight(Integer id, Route route, Airplane airplane, String departureTime, Integer reservedSeats,
			Float seatPrice) {
		this.id = id;
		this.route = route;
		this.airplane = airplane;
		this.departureTime = departureTime;
		this.reservedSeats = reservedSeats;
		this.seatPrice = seatPrice;
	}

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the route
	 */
	public Route getRoute() {
		return route;
	}

	/**
	 * @param route the route to set
	 */
	public void setRoute(Route route) {
		this.route = route;
	}

	/**
	 * @return the airplane
	 */
	public Airplane getAirplane() {
		return airplane;
	}

	/**
	 * @param airplane the airplane to set
	 */
	public void setAirplane(Airplane airplane) {
		this.airplane = airplane;
	}

	/**
	 * @return the departureTime
	 */
	public String getDepartureTime() {
		return departureTime;
	}

	/**
	 * @param departureTime the departureTime to set
	 */
	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}

	/**
	 * @return the reservedSeats
	 */
	public Integer getReservedSeats() {
		return reservedSeats;
	}

	/**
	 * @param reservedSeats the reservedSeats to set
	 */
	public void setReservedSeats(Integer reservedSeats) {
		this.reservedSeats = reservedSeats;
	}

	/**
	 * @return the seatPrice
	 */
	public Float getSeatPrice() {
		return seatPrice;
	}

	/**
	 * @param seatPrice the seatPrice to set
	 */
	public void setSeatPrice(Float seatPrice) {
		this.seatPrice = seatPrice;
	}

}

/**
 * 
 */
package com.ss.utopia.domain;

import java.util.List;

/**
 * @author Wyatt Meehan
 *
 */
public class Airport {
	private String airportID;
	private String city;
	private List<Route> routes;
	
	
	/**
	 * @return the airportID
	 */
	public String getAirportID() {
		return airportID;
	}
	/**
	 * @param airportID the airportID to set
	 */
	public void setAirportID(String airportID) {
		this.airportID = airportID;
	}
	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}
	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}
	/**
	 * @return the routes
	 */
	public List<Route> getRoutes() {
		return routes;
	}
	/**
	 * @param routes the routes to set
	 */
	public void setRoutes(List<Route> routes) {
		this.routes = routes;
	}
	
	
}

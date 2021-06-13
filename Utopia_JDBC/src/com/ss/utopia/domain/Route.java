/**
 * 
 */
package com.ss.utopia.domain;

/**
 * @author meeha
 *
 */
public class Route {
	private Integer routeID;
	private Airport originAirort;
	private Airport destAirport;
	
	/**
	 * @return the routeID
	 */
	public Integer getRouteID() {
		return routeID;
	}
	/**
	 * @param routeID the routeID to set
	 */
	public void setRouteID(Integer routeID) {
		this.routeID = routeID;
	}
	/**
	 * @return the originAirort
	 */
	public Airport getOriginAirort() {
		return originAirort;
	}
	/**
	 * @param originAirort the originAirort to set
	 */
	public void setOriginAirort(Airport originAirort) {
		this.originAirort = originAirort;
	}
	/**
	 * @return the destAirport
	 */
	public Airport getDestAirport() {
		return destAirport;
	}
	/**
	 * @param destAirport the destAirport to set
	 */
	public void setDestAirport(Airport destAirport) {
		this.destAirport = destAirport;
	}
	
}

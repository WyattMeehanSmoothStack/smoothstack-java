/**
 * 
 */
package com.ss.utopia.domain;

/**
 * @author Wyatt Meehan
 *
 */
public class AirplaneType {
	private Integer id;
	private Integer maxCapacity;

	/**
	 * @param id
	 * @param maxCapacity
	 */
	public AirplaneType(Integer id, Integer maxCapacity) {

		this.id = id;
		this.maxCapacity = maxCapacity;
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
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the maxCapacity
	 */
	public Integer getMaxCapacity() {
		return maxCapacity;
	}

	/**
	 * @param maxCapacity the maxCapacity to set
	 */
	public void setMaxCapacity(int maxCapacity) {
		this.maxCapacity = maxCapacity;
	}

}

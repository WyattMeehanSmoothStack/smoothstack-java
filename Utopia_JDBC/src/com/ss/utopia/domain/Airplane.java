/**
 * 
 */
package com.ss.utopia.domain;

/**
 * @author Wyatt Meehan
 *
 */
public class Airplane {
	private Integer id;
	private AirplaneType typeId;

	/**
	 * @param id
	 * @param typeId
	 */
	public Airplane(Integer id, AirplaneType typeId) {
		this.id = id;
		this.typeId = typeId;
	}
	
	public Airplane() {
		
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
	 * @return the typeId
	 */
	public AirplaneType getType() {
		return typeId;
	}

	/**
	 * @param typeId the typeId to set
	 */
	public void setTypeId(AirplaneType typeId) {
		this.typeId = typeId;
	}
}

/**
 * 
 */
package com.ss.utopia.domain;

/**
 * @author Wyatt Meehan
 *
 */
public class Booking {
	private Integer id;
	private Boolean isActive;
	private String confirmationCode;

	/**
	 * @param id
	 * @param isActive
	 * @param confirmationCode
	 */
	public Booking(Integer id, Boolean isActive, String confirmationCode) {
		this.id = id;
		this.isActive = isActive;
		this.confirmationCode = confirmationCode;
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
	 * @return the isActive
	 */
	public Boolean getIsActive() {
		return isActive;
	}

	/**
	 * @param isActive the isActive to set
	 */
	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	/**
	 * @return the confirmationCode
	 */
	public String getConfirmationCode() {
		return confirmationCode;
	}

	/**
	 * @param confirmationCode the confirmationCode to set
	 */
	public void setConfirmationCode(String confirmationCode) {
		this.confirmationCode = confirmationCode;
	}

}

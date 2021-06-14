/**
 * 
 */
package com.ss.utopia.domain;

import java.sql.Date;

/**
 * @author Wyatt Meehan
 *
 */
public class Passenger {
	private Integer id;
	private Booking booking;
	private String givenName;
	private String familyName;
	private Date dob;
	private String gender;
	private String address;

	/**
	 * @param id
	 * @param booking
	 * @param givenName
	 * @param familyName
	 * @param dob
	 * @param gender
	 * @param address
	 */
	public Passenger(Integer id, Booking booking, String givenName, String familyName, Date dob, String gender,
			String address) {
		this.id = id;
		this.booking = booking;
		this.givenName = givenName;
		this.familyName = familyName;
		this.dob = dob;
		this.gender = gender;
		this.address = address;
	}
	
	public Passenger() {
		
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
	 * @return the givenName
	 */
	public String getGivenName() {
		return givenName;
	}

	/**
	 * @param givenName the givenName to set
	 */
	public void setGivenName(String givenName) {
		this.givenName = givenName;
	}

	/**
	 * @return the familyName
	 */
	public String getFamilyName() {
		return familyName;
	}

	/**
	 * @param familyName the familyName to set
	 */
	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}

	/**
	 * @return the dob
	 */
	public Date getDob() {
		return dob;
	}

	/**
	 * @param dob the dob to set
	 */
	public void setDob(Date dob) {
		this.dob = dob;
	}

	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

}

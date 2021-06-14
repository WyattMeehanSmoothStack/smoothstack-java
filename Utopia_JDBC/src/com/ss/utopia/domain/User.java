/**
 * 
 */
package com.ss.utopia.domain;

/**
 * @author meeha
 *
 */
public class User {
	private Integer id;
	private UserRole userRole;
	private String givenName;
	private String familyName;
	private String userName;
	private String email;
	private String phone;
	
	/**
	 * @param id
	 * @param userRole
	 * @param givenName
	 * @param familyName
	 * @param userName
	 * @param email
	 * @param phone
	 */
	public User(Integer id, UserRole userRole, String givenName, String familyName, String userName, String email,
			String phone) {
		this.id = id;
		this.userRole = userRole;
		this.givenName = givenName;
		this.familyName = familyName;
		this.userName = userName;
		this.email = email;
		this.phone = phone;
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
	 * @return the userRole
	 */
	public UserRole getUserRole() {
		return userRole;
	}
	/**
	 * @param userRole the userRole to set
	 */
	public void setUserRole(UserRole userRole) {
		this.userRole = userRole;
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
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}
	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}
	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
}

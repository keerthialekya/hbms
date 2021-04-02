package com.cg.hbm.entities;
import javax.persistence.Entity;


import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 * 
 * @author Harshitha
 *
 */
@Entity
@Table(name="Hotel")
public class Hotel {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	private int hotel_id;
	private String city;
	private String hotel_name;
	private String address;
	private String description;
	private double avg_rate_per_day;
	private String email;
	private String phone1;
	private String phone2;
	private String website;
	
	public Hotel () {
		
	}
	/**
	 * 
	 * @param city
	 * @param hotel_name
	 * @param address
	 * @param description
	 * @param avg_rate_per_day
	 * @param email
	 * @param phone1
	 * @param phone2
	 * @param website
	 */
	
	public Hotel(String city, String hotel_name, String address, String description,
			double avg_rate_per_day, String email, String phone1, String phone2, String website) {
		super();
		//this.hotel_id=hotel_id;
		this.city = city;
		this.hotel_name = hotel_name;
		this.address = address;
		this.description = description;
		this.avg_rate_per_day = avg_rate_per_day;
		this.email = email;
		this.phone1 = phone1;
		this.phone2 = phone2;
		this.website = website;
		
	}
	/**
	 * 
	 * @return int
	 */

	public int getHotel_id() {
		return hotel_id;
	}
	/**
	 * 
	 * @param hotel_id
	 */
	public void setHotel_id(int hotel_id) {
		this.hotel_id = hotel_id;
	}
	/**
	 * 
	 * @return String
	 */

	public String getCity() {
		return city;
	}
	/**
	 * 
	 * @param city
	 */

	public void setCity(String city) {
		this.city = city;
	}
	/**
	 * 
	 * @return String
	 */

	public String getHotel_name() {
		return hotel_name;
	}
	/**
	 * 
	 * @param hotel_name
	 */

	public void setHotel_name(String hotel_name) {
		this.hotel_name = hotel_name;
	}
	/**
	 * 
	 * @return String
	 */

	public String getAddress() {
		return address;
	}
	/**
	 * 
	 * @param address
	 */

	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * 
	 * @return String
	 */

	public String getDescription() {
		return description;
	}
	/**
	 * 
	 * @param description
	 */

	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * 
	 * @return double
	 */

	public double getAvg_rate_per_day() {
		return avg_rate_per_day;
	}
	/**
	 * 
	 * @param avg_rate_per_day
	 */

	public void setAvg_rate_per_day(double avg_rate_per_day) {
		this.avg_rate_per_day = avg_rate_per_day;
	}
	/**
	 * 
	 * @return String
	 */
	

	public String getEmail() {
		return email;
	}
	/**
	 * 
	 * @param email
	 */

	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * 
	 * @return String
	 */

	public String getPhone1() {
		return phone1;
	}
	/**
	 * 
	 * @param phone1
	 */

	public void setPhone1(String phone1) {
		this.phone1 = phone1;
	}
	/**
	 * 
	 * @return String
	 */

	public String getPhone2() {
		return phone2;
	}
	/**
	 * 
	 * @param phone2
	 */

	public void setPhone2(String phone2) {
		this.phone2 = phone2;
	}
	/**
	 * 
	 * @return String
	 */

	public String getWebsite() {
		return website;
	}
	/**
	 * 
	 * @param website
	 */

	public void setWebsite(String website) {
		this.website = website;
	}
	

}
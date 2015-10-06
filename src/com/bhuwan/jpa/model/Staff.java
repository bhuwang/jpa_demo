/**
 * 
 */
package com.bhuwan.jpa.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author bhuwan
 *
 */
@Entity
@Table(name = "staff")
public class Staff {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	// Makes this column NOT NULL
	@Column(nullable = false)
	private String name;

	private String address;

	private String tempAddress;

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address
	 *            the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the tempAddress
	 */
	public String getTempAddress() {
		return tempAddress;
	}

	/**
	 * @param tempAddress
	 *            the tempAddress to set
	 */
	public void setTempAddress(String tempAddress) {
		this.tempAddress = tempAddress;
	}
}

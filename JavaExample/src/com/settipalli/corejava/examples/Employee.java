/**
 * 
 */
package com.settipalli.corejava.examples;

import java.util.List;

/**
 * @author admin
 *
 */

public class Employee {

	private String emplId;
	private String emplName;
	private List<EmployeeAddress> employeeAddress;

	/**
	 * @return the emplId
	 */
	public String getEmplId() {
		return emplId;
	}

	/**
	 * @param emplId
	 *            the emplId to set
	 */
	public void setEmplId(String emplId) {
		this.emplId = emplId;
	}

	/**
	 * @return the emplName
	 */
	public String getEmplName() {
		return emplName;
	}

	/**
	 * @param emplName
	 *            the emplName to set
	 */
	public void setEmplName(String emplName) {
		this.emplName = emplName;
	}

	/**
	 * @return the employeeAddress
	 */
	public List<EmployeeAddress> getEmployeeAddress() {
		return employeeAddress;
	}

	/**
	 * @param employeeAddress
	 *            the employeeAddress to set
	 */
	public void setEmployeeAddress(List<EmployeeAddress> employeeAddress) {
		this.employeeAddress = employeeAddress;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Employee [emplId=" + emplId + ", emplName=" + emplName + ", employeeAddress=" + employeeAddress + "]";
	}

}

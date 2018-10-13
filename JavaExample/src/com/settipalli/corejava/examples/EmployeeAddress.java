/**
 * 
 */
package com.settipalli.corejava.examples;

/**
 * @author admin
 *
 */
public class EmployeeAddress {

	private String emplAddLine;
	private String emplVlg;
	private String emplDrtcs;
	private String emplSt;
	private String emplCntr;
	private String emplPincd;

	/**
	 * @return the emplAddLine
	 */
	public String getEmplAddLine() {
		return emplAddLine;
	}

	/**
	 * @param emplAddLine
	 *            the emplAddLine to set
	 */
	public void setEmplAddLine(String emplAddLine) {
		this.emplAddLine = emplAddLine;
	}

	/**
	 * @return the emplVlg
	 */
	public String getEmplVlg() {
		return emplVlg;
	}

	/**
	 * @param emplVlg
	 *            the emplVlg to set
	 */
	public void setEmplVlg(String emplVlg) {
		this.emplVlg = emplVlg;
	}

	/**
	 * @return the emplDrtcs
	 */
	public String getEmplDrtcs() {
		return emplDrtcs;
	}

	/**
	 * @param emplDrtcs
	 *            the emplDrtcs to set
	 */
	public void setEmplDrtcs(String emplDrtcs) {
		this.emplDrtcs = emplDrtcs;
	}

	/**
	 * @return the emplSt
	 */
	public String getEmplSt() {
		return emplSt;
	}

	/**
	 * @param emplSt
	 *            the emplSt to set
	 */
	public void setEmplSt(String emplSt) {
		this.emplSt = emplSt;
	}

	/**
	 * @return the emplCntr
	 */
	public String getEmplCntr() {
		return emplCntr;
	}

	/**
	 * @param emplCntr
	 *            the emplCntr to set
	 */
	public void setEmplCntr(String emplCntr) {
		this.emplCntr = emplCntr;
	}

	/**
	 * @return the emplPincd
	 */
	public String getEmplPincd() {
		return emplPincd;
	}

	/**
	 * @param emplPincd
	 *            the emplPincd to set
	 */
	public void setEmplPincd(String emplPincd) {
		this.emplPincd = emplPincd;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "EmployeeAddress [emplAddLine=" + emplAddLine + ", emplVlg=" + emplVlg + ", emplDrtcs=" + emplDrtcs
				+ ", emplSt=" + emplSt + ", emplCntr=" + emplCntr + ", emplPincd=" + emplPincd + "]";
	}

}

/**
 * 
 */
package com.settipalli.corejava.examples;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author admin
 *
 */
public class EmployeeDemo {

	private static List<EmployeeInfo> getEmployeeInfo() {

		List<EmployeeInfo> emplInfoLst = new ArrayList<EmployeeInfo>();

		EmployeeInfo emplInfoOne = new EmployeeInfo();

		emplInfoOne.setEmplId("101");
		emplInfoOne.setEmplName("Settipalli");
		emplInfoOne.setEmplAddLine("SinderLandRoad");
		emplInfoOne.setEmplVlg("BroadHeath");
		emplInfoOne.setEmplDrtcs("Cheshire");
		emplInfoOne.setEmplSt("Warrington");
		emplInfoOne.setEmplCntr("GBR");
		emplInfoOne.setEmplPincd("WA145EU");

		EmployeeInfo emplInfoTwo = new EmployeeInfo();

		emplInfoTwo.setEmplId("101");
		emplInfoTwo.setEmplName("Settipalli");
		emplInfoTwo.setEmplAddLine("19 RaceFieldRaod");
		emplInfoTwo.setEmplVlg("KnutsFord");
		emplInfoTwo.setEmplDrtcs("Cheshire");
		emplInfoTwo.setEmplSt("Warrington");
		emplInfoTwo.setEmplCntr("GBR");
		emplInfoTwo.setEmplPincd("WA16BW");

		emplInfoLst.add(emplInfoOne);
		emplInfoLst.add(emplInfoTwo);

		return emplInfoLst;
	}

	public static void main(String args[]) {

		int i = 1;

		Map<String, Employee> addreListMap = new HashMap<String, Employee>();

		List<EmployeeAddress> emplAdrLst = new ArrayList<>();
		Employee emp = new Employee();

		for (EmployeeInfo employeeInfo : getEmployeeInfo()) {

			emp.setEmplId(employeeInfo.getEmplId());
			emp.setEmplName(employeeInfo.getEmplName());
			EmployeeAddress empAdr = new EmployeeAddress();
			empAdr.setEmplAddLine(employeeInfo.getEmplAddLine());
			empAdr.setEmplVlg(employeeInfo.getEmplVlg());
			empAdr.setEmplDrtcs(employeeInfo.getEmplDrtcs());
			empAdr.setEmplSt(employeeInfo.getEmplSt());
			empAdr.setEmplCntr(employeeInfo.getEmplCntr());
			empAdr.setEmplPincd(employeeInfo.getEmplPincd());
			emplAdrLst.add(empAdr);
			emp.setEmployeeAddress(emplAdrLst);

			addreListMap.put(employeeInfo.getEmplId(), emp);
		}

		Employee empinfo = addreListMap.get(emp.getEmplId());

		System.out.println("EmployeeInfo  :::: " + empinfo.getEmployeeAddress());

		for (EmployeeAddress adrInfo : empinfo.getEmployeeAddress()) {

			System.out.println("Address  ::: " + i++ + " " + adrInfo);
		}

	}
}

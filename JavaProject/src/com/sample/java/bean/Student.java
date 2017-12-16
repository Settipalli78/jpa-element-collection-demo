package com.sample.java.bean;

public class Student {

	private int stdId;
	private String stdName;
	private String stdClass;

	public Student(int stdId, String stdName, String stdClass) {
		super();
		this.stdId = stdId;
		this.stdName = stdName;
		this.stdClass = stdClass;
	}

	public int getStdId() {
		return stdId;
	}

	public void setStdId(int stdId) {
		this.stdId = stdId;
	}

	public String getStdName() {
		return stdName;
	}

	public void setStdName(String stdName) {
		this.stdName = stdName;
	}

	public String getStdClass() {
		return stdClass;
	}

	public void setStdClass(String stdClass) {
		this.stdClass = stdClass;
	}

	@Override
	public String toString() {
		return "Student [stdId=" + stdId + ", stdName=" + stdName + ", stdClass=" + stdClass + "]";
	}

}

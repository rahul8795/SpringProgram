package com.cts.beans;

public class Student {
	private String sid;
	private String sname;
	private String saddr;
	public String getSid() {
		return sid;
	}
	public void setSid(String sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSaddr() {
		return saddr;
	}
	public void setSaddr(String saddr) {
		this.saddr = saddr;
	}
	
	public void getStudentDetails() {
		System.out.println("Student Details");
		System.out.println("-----------------");
		System.out.println("Student Id    :"+sid);
		System.out.println("Student Name  :"+sname);
		System.out.println("Student Address :"+saddr);
		
	}
	
}

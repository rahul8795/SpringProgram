package com.cts.beans;

public class Employee {
	private int eno;
	private String name;
	private float esal;
	private String eaddr;
	public int getEno() {
		return eno;
	}
	public void setEno(int eno) {
		this.eno = eno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getEsal() {
		return esal;
	}
	public void setEsal(float esal) {
		this.esal = esal;
	}
	public String getEaddr() {
		return eaddr;
	}
	public void setEaddr(String eaddr) {
		this.eaddr = eaddr;
	}
	
	
	public void getEmpDetails() {
		System.out.println("Employee Details");
		System.out.println("----------------------");
		System.out.println("Employee Number  :"+eno);
		System.out.println("Employee Name    :"+name);
		System.out.println("Employee Salary  :"+esal);
		System.out.println("Employee Address :"+eaddr);
		
	}
}

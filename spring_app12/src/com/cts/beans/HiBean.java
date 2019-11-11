package com.cts.beans;

public class HiBean {
	private String name;
	private String message;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	public void init() {
		System.out.println("init()-HiBean");
		name = "AAA";
		message = "Good Morning!";
	}
	public void destroy() {
		System.out.println("destroy()-HiBean");
	}
	
	public String sayHi() {
		return "Hi "+name+", "+message;
	}
}

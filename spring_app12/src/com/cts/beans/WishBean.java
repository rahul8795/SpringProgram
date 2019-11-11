package com.cts.beans;

public class WishBean {
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
		System.out.println("init()-WishBean");
		name = "AAA";
		message = "Have a good day";
	}
	public void destroy() {
		System.out.println("destroy()-WishBean");
	}
	
	public void localInit() {
		System.out.println("localInit()-WichBean");
		name = "BBB";
		message = "Have a great day";
	}
	public void localDestroy() {
		System.out.println("localDestroy()-WishBean");
	}
	
	public String sayWish() {
		return name+", "+message;
	}
}

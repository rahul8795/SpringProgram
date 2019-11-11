package com.cts.beans;

public class WelcomeBean {
	private String name;
	static {
		System.out.println("WelcomeBean class loading......");
	}
	public WelcomeBean() {
		System.out.println("WelcomeBean class instantiation......");
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	public String getWelcomeMessage() {
		return "Hello "+name + " , Welcome to CTS";
	}
}

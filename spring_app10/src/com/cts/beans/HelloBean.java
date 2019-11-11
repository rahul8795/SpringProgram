package com.cts.beans;

public class HelloBean {
	
	static {
		System.out.println("HelloBean class loading");
		
	}
	public HelloBean(){
		System.out.println("HelloBean Instantiation");
	}
	public String sayHello() {
		return "Hello user!";
	}
//	public static HelloBean getInstance() {
//		System.out.println("Static Factory Method");
//		return new HelloBean();
//	}
	
}

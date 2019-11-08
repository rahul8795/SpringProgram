package com.cts.beans;

public class HelloBean {
	static {
		System.out.println("HelloBean Class loading");
	}
	public HelloBean() {
		System.out.println("HelloBean class Instantiation");
	}
	public String sayHello() {
		return "Hello User!";
	}
}

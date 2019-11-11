package com.cts.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class HelloBean implements InitializingBean, DisposableBean  {
	private String name;
	private String message;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		System.out.println("Initilizaing 'name' through setName()  method");
		this.name = name;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		System.out.println("Initilizaing 'message' through setMessage()  method");
		this.message = message;
	}
	/*
	public void init() {
		//System.out.println("Initilizaing 'name'and message through init()  method");
		name = "Rahul";
		message = "Good Morning";
	}
	public void destroy() {
		System.out.println("destroy()-Method");
		name = "";
		message = "";
	}
	
	
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Initializing through afterPropertiesSet() method");
		name = "Ramesh";
		message = "Good morning";
	}
	@Override
	public void destroy() throws Exception {
		System.out.println("destroy() method");
	}
		
	public String sayHello() {
		return "Hello "+name+" "+ message;
	}

	@PostConstruct
	public void initilizeBean(){
		System.out.println("Initilization through @PostConstruct method");
		name = "Rahul";
		message = "Good Morning";
	}
	@PreDestroy
	public void destroyBean() {
		System.out.println("Bean Deinstantiation through @PreDestroy method");
	}
	*/
	public void customInit() {
		System.out.println("Initilizing 'name' and 'message' through customIntit() method");
		name = "BBB";
		message = "Good Morning";
	}
	public void customDestroy() {
		System.out.println("Destroying through customDestroy() method");
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Initilizing 'name' and 'message' through afterPropertiesSet() from InitilizingBean");
		name = "CCC";
		message = "Good Afternoon!";
	}
	@Override
	public void destroy() throws Exception {
		System.out.println("Destroying Bean through destroy() method from DisposaleBean");
	}
	
	@PostConstruct
	public void postContructInit() {
		System.out.println("Initializing 'name' and 'message' through @PostConstruct annotation");
		name = "DDD";
		message = "Good night";
	}
	@PreDestroy
	public void preDestroy() throws Exception {
		System.out.println("Destroying Bean through destroy() method from DisposalBean");
	}
	public String sayHello() {
		return "Hello " + name +" ,"+message;
	}
}

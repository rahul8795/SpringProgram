package com.cts.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cts.beans.HelloBean;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("/com/cts/resources/applicationContext.xml");
		HelloBean hello = (HelloBean) context.getBean("helloBean");
		System.out.println(hello.sayHello());
	}

}

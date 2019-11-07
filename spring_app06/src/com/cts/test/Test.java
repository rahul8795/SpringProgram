package com.cts.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cts.beans.HelloBean;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("/com/cts/resources/applicationContext.xml");
		System.out.println(context.getBean("helloBean"));
		System.out.println(context.getBean("helloBean"));
		System.out.println(context.getBean("helloBean"));
//		HelloBean hello1 = (HelloBean) context.getBean("helloBean1");
//		System.out.println(hello1.sayHello());
//		HelloBean hello2 = (HelloBean) context.getBean("helloBean2");
//		System.out.println(hello2.sayHello());
//		HelloBean hello3 = (HelloBean) context.getBean("helloBean3");
//		System.out.println(hello3.sayHello());
		
		
//		System.out.println(hello1);
//		System.out.println(hello2);
//		System.out.println(hello3);
	}

}

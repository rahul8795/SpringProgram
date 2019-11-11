package com.cts.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cts.beans.HelloBean;
import com.cts.beans.HiBean;
import com.cts.beans.WishBean;

public class Test {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("/com/cts/resources/applicationContext.xml");
		WishBean wishBean = (WishBean) context.getBean("wishBean");
		System.out.println(wishBean.sayWish());
		
		HelloBean helloBean= (HelloBean) context.getBean("helloBean");
		System.out.println(helloBean.sayHello());
		
		HiBean hiBean = (HiBean) context.getBean("hiBean");
		System.out.println(hiBean.sayHi());
		
		
		context.registerShutdownHook();
	}

}

package com.cts.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cts.beans.HelloBean;
import com.cts.beans.WelcomeBean;
import com.cts.config.AppConfig;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		String[] beanNames = context.getBeanDefinitionNames();
		for(String beanName : beanNames){
			System.out.println(beanName);
		}
//		WelcomeBean welBean1 = (WelcomeBean) context.getBean("welcomeBean");
//		System.out.println(welBean1.getWelcomeMessage());
//		WelcomeBean welBean2 = (WelcomeBean) context.getBean("welcomeBean");
//		System.out.println(welBean2.getWelcomeMessage());
//		System.out.println(welBean1);
//		System.out.println(welBean2);
//		System.out.println(welBean1 == welBean2);
		
		
//		HelloBean helloBean = (HelloBean) context.getBean("helloBean");
//		System.out.println(helloBean.sayHello());
	}

}

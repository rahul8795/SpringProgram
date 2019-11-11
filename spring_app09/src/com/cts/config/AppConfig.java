package com.cts.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.cts.beans.HelloBean;
import com.cts.beans.WelcomeBean;

@Configuration
public class AppConfig {
	static {
		System.out.println("AppConfig class loading......");
	}
	public AppConfig() {
		System.out.println("AppConfig class instantiation......");
	}
	@Bean
	public WelcomeBean welcomeBean() {
		WelcomeBean wb = new WelcomeBean();
		wb.setName("Rahul");
		return wb;
	}
	
	@Bean
	public HelloBean helloBean() {
		HelloBean hb = new HelloBean();
		hb.setName("Rahul");
		return hb;
	}
}

package com.cts.factory;

import com.cts.beans.HelloBean;

public class HelloBeanFactory {
	public HelloBean getHelloBeanInstance() {
		System.out.println("getHelloBeanInstance()- HelloBeanFactory");
		return new HelloBean();
	}
}

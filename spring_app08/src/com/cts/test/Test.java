package com.cts.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cts.beans.HelloBean;
import com.cts.scopes.ThreadScope;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("/com/cts/resources/applicationContext.xml");
		HelloBean helloBean1 = (HelloBean) context.getBean("helloBean");
		HelloBean helloBean2 = (HelloBean) context.getBean("helloBean");
		
		System.out.println("Main Thread : "+helloBean1);
		System.out.println("Main Thread : "+helloBean2);
		
		Runnable r = new Runnable(){
			{
		}
			
			@Override
			public void run() {
				HelloBean helloBean3 = (HelloBean) context.getBean("helloBean");
				HelloBean helloBean4 = (HelloBean) context.getBean("helloBean");
				System.out.println("User Thread : "+helloBean3);
				System.out.println("User Thread : "+helloBean4);
			}
		}; 
		Thread t1 = new Thread(r);
		t1.start();
		
		new Thread(() ->{
			HelloBean helloBean5 = (HelloBean) context.getBean("helloBean");
			HelloBean helloBean6 = (HelloBean) context.getBean("helloBean");
			System.out.println("User Thread2 : "+helloBean5);
			System.out.println("User Thread3 : "+helloBean6);
		}).start();
		
//		ThreadScope threadScope = (ThreadScope) context.getBean("threadScope");
//		HelloBean helloBean = (HelloBean) threadScope.remove("helloBean");
//		System.out.println(helloBean);
//		
//		HelloBean helloBean3 = (HelloBean) context.getBean("helloBean");
//		System.out.println(helloBean3);
//		
//		HelloBean helloBean4 = (HelloBean) threadScope.remove("helloBean");
//		System.out.println(helloBean4);
		
	}

}

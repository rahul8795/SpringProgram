package com.cts.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cts.beans.Student;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("/com/cts/resources/applicationContext.xml");
		Student std = (Student) context.getBean("stdBean");
		std.getStudentDetails();
	}

}

package org.jsp.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("demo.xml");
	((ClassPathXmlApplicationContext)context).close();
	}
}

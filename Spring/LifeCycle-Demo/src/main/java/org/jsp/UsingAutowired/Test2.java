package org.jsp.UsingAutowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test2 {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext("org.jsp.UsingAutowired");
		EmployeeListAndSet c = context.getBean(EmployeeListAndSet.class);
		System.out.println(c.getIds());
		System.out.println(c.getNames());
	}
}

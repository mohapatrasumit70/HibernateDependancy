package org.jsp.UsingAutowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext("org.jsp.UsingAutowired");
		Car c = context.getBean(Car.class);
		c.getE().Start();

	}

}

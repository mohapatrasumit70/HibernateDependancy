package org.jsp.UsingValue;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context =new AnnotationConfigApplicationContext(Person.class);
		Person p = context.getBean(Person.class);
System.out.println(p.getAge());
System.out.println(p.getName());

	} 

}

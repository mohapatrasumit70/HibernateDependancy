package org.jsp.LifeCycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestLifeUsingApplicationContext {

	public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("lifecycle.xml");
	System.out.println(context.getBean("life"));

	}

}

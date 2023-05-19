package org.jsp.BabyIceCream;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBabyIcecream {

	public static void main(String[] args) {
		ApplicationContext context =new ClassPathXmlApplicationContext("BabyIcecream.xml");
		
		Baby b = context.getBean("baby",Baby.class);
		b.getIcecream().eat();

	}

}

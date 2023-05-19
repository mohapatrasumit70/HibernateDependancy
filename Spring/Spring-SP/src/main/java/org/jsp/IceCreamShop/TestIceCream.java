package org.jsp.IceCreamShop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestIceCream {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext("org.jsp.IceCreamShop");
		Baby t = context.getBean(Baby.class);
		t.getC().Eat();
	}

}

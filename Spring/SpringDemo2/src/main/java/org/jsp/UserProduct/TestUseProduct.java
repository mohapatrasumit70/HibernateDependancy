package org.jsp.UserProduct;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUseProduct {

	public static void main(String[] args) {
		ApplicationContext context =new ClassPathXmlApplicationContext("UserProduct.xml");
		User u =context.getBean("myuser",User.class);
		u.getP().display();
				}
}

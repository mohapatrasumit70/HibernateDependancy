package orj.jsp.SpringDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestByUsingAc {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("car.xml");
		Car c = context.getBean("mycar",Car.class);
		c.start();
	}
}

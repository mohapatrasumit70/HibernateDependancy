package orj.jsp.SpringDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("car.xml");
		Person p = context.getBean("myperson",Person.class);
		p.display();
	}
}

package orj.jsp.SpringDemo3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
ApplicationContext context = new ClassPathXmlApplicationContext("userproduct.xml");
User u = context.getBean("p",User.class);
}

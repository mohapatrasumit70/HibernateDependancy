package orj.jsp.SpringDemo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {

	public static void main(String[] args) {
		Resource r = new ClassPathResource("car.xml");
		BeanFactory factory = new XmlBeanFactory(r);
		Car c = factory.getBean(Car.class);
		c.start();
	}

}
 
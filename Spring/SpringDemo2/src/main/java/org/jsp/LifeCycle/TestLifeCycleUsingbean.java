package org.jsp.LifeCycle;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class TestLifeCycleUsingbean {

	public static void main(String[] args) {
	Resource r =new ClassPathResource("lifecycle.xml");
	BeanFactory factory=new XmlBeanFactory(r);
	

	}

}

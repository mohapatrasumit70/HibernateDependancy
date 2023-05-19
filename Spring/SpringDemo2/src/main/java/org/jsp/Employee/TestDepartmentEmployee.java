package org.jsp.Employee;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDepartmentEmployee {

	public static void main(String[] args) {
		ApplicationContext context =new ClassPathXmlApplicationContext("EmployeeDepartment.xml");
		Department d= context.getBean("dept",Department.class);
		System.out.println(d.getEid());
		System.out.println(d.getName());
		System.out.println(d.getDetail());

	}

}

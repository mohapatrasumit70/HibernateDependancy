package org.jsp.Controller;

import java.util.ArrayList;
import java.util.Arrays;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.jsp.dao.Department;
import org.jsp.dao.Employee;

public class SaveDepartmentAndEmployee {
	static EntityManager manager =Persistence.createEntityManagerFactory("dev").createEntityManager();
	public static void main(String[] args) {
		Department d = new Department();
		d.setName("Devlopment");
		d.setLocation("BTM Layout");
		Employee e1 = new Employee();
		e1.setName("ABC");
		e1.setDesg("trainner");
		e1.setD(d);
		
		Employee e2 = new Employee();
		e2.setName("ABC");
		e2.setDesg("trainner");
		e2.setD(d);
		Employee e3 = new Employee();
		e3.setName("ABC");
		e3.setDesg("trainner");
		e3.setD(d);
		d.setemps( new ArrayList<Employee>(Arrays.asList(e1,e2,e3)));
		   EntityManager manager = Persistence.createEntityManagerFactory("dev").createEntityManager();
		  	EntityTransaction t = manager.getTransaction();
		      manager.persist(d);
		      t.begin();
		      t.commit();
	}

}

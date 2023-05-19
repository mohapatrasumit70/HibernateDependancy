package EmployeeNew.jsp.Hibernate;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveEmployeeData {

	public static void main(String[] args) {
//		Scanner sc = new Scanner (System.in);
//		System.out.println("ENTER NAME,PHONE");
//		String name=sc.next();
//		long phone =sc.nextLong();
	EntityManagerFactory factory =Persistence.createEntityManagerFactory("dev");
	EntityManager m = factory.createEntityManager();
//		Employee e =new Employee();
//		e.setName(name);
//		e.setPhone(phone);
//		m.persist(e);
//		EntityTransaction t =m.getTransaction();
//		t.begin();
//		t.commit();
		

	}

}

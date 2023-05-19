package Hibernate.jpa.test;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdatePerson {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("enter the id");
		int id =sc.nextInt();
		System.out.println("enter the Name,phone and password");
		String name = sc.next();
		long phone =sc.nextLong();
		String password =sc.next();
		Person p = new Person();
		p.setId(id);
		p.setName(name);
		p.setPhone(phone);
		p.setPassword(password);
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
		EntityManager manager = factory.createEntityManager();
		manager.merge(p);
		EntityTransaction t =manager.getTransaction();
		t.begin();
		t.commit();

	}

}

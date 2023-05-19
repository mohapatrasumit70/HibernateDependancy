package Hibernate.jpa.test;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DeletePerson {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("enter the id");
		int id =sc.nextInt();
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
		EntityManager manager = factory.createEntityManager();
		Person p =manager.find(Person.class, id);
		manager.remove(p);
		EntityTransaction t =manager.getTransaction();
		t.begin();
		t.commit();
		System.out.println(p.getId()+"is delete");

	}

}

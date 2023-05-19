package Hibernate.jpa.test;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FetchData {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("enter the id");
		int id =sc.nextInt();
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
		EntityManager manager = factory.createEntityManager();
		Person p =manager.find(Person.class, id);
       if(p!=null)
       {
    	   System.out.println(p.getId());
    	   System.out.println(p.getName());
    	   System.out.println(p.getPhone());
    	   System.out.println(p.getPassword());
       }
       else
       {
    	   System.err.println("INVALID ID ");
       }
	}

}

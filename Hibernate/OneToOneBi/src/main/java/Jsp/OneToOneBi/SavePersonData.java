package Jsp.OneToOneBi;


import java.time.LocalDate;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;



public class SavePersonData {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER YOUR NAME ,NAME ,PHONE,ADHARNUMBER ");
		String name =sc.next();
		long phone =sc.nextLong();
		long number =sc.nextLong();
	EntityManager manager =Persistence.createEntityManagerFactory("dev").createEntityManager();
	EntityTransaction t = manager.getTransaction();
	Person p = new Person();
	p.setName(name);
	p.setPhone(phone);
	AdharCard card = new AdharCard();
	card.setNumber(number);
	card.setDob(LocalDate.parse("1996-05-14"));
	card.setP(p);
	p.setCard(card);
	manager.persist(p);
	t.begin();	
	t.commit();
	}
}

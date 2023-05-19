package Hibernate.jpa.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SavePeron {
public static void main(String[] args) {
	Person p = new Person();
	p.setName("sumit");
	p.setPhone(9658);
	p.setPassword("a123");
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
	EntityManager manager =factory.createEntityManager();
	manager.persist(p);
	EntityTransaction t = manager.getTransaction();
	t.begin();
	t.commit();
	System.out.println(p.getId()+"ID Is save");
}
}

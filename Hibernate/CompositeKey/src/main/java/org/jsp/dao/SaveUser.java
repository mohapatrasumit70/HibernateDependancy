package org.jsp.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveUser {

	public static void main(String[] args) {
		EntityManager manager = Persistence.createEntityManagerFactory("dev").createEntityManager();
		EntityTransaction transaction =manager.getTransaction();
		
		UserId id=new UserId();
		id.setEmail("1@gmail.com");
		id.setPhone(9658656493l);
		User u = new User();
		u.setId(id);
		u.setName("Kl Rahul");
		u.setPassword("athiya");
		manager.persist(u);
		transaction.begin();
		transaction.commit();
	}
}  

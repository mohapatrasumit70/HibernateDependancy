package org.jsp.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveData {

	public static void main(String[] args) {
		EntityManager manager =Persistence.createEntityManagerFactory("dev").createEntityManager();
		EntityTransaction transaction =manager.getTransaction();
		FoodOrder order=new FoodOrder();
		order.setLocation("BTM");
		order.setCost(450.2);
       manager.persist(order);
       transaction.begin();
       transaction.commit();
	}

}

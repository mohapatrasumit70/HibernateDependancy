package Hibernate.jpa.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;

import Hibernate.jpa.test.Person;

public class FindAll {

	public static void main(String[] args) {
	  EntityManager manager =Persistence.createEntityManagerFactory("dev").createEntityManager();
	  Query q = manager.createNamedQuery("FIndAll");
	  List<Person> persons =q.getResultList();
	  for(Person p:persons)
	  {
		  System.out.println(p);
	  }

	}

}

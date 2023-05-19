package org.jsp.dao;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class FetchById {

	public static void main(String[] args) {
		EntityManager manager =Persistence.createEntityManagerFactory("dev").createEntityManager();
		Question q = new Question();
		String qry="select q from Question q where a.id=?";
	}

}

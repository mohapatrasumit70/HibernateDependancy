package org.jsp.dao;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FetchHospitalById {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your id to fetch the data");
		int id =sc.nextInt();
		String qry ="Select h from Hospital h where h.id=?1";
		EntityManager manager =Persistence.createEntityManagerFactory("dev").createEntityManager();
		Query q =manager.createQuery(qry);
	    q.setParameter(1, id);
	    Hospital h = (Hospital) q.getSingleResult();
	    if(h!=null)
	    {
	    	System.out.println(h.getName());
	    	System.out.println(h.getFounder());
	    	System.out.println(h.getName());
	    }
	}

}

package org.jsp.dao;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FetchHospitalByName {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your id to fetch the data");
		String name =sc.next();
		String qry ="Select h from Hospital h where h.name=?1";
		EntityManager manager =Persistence.createEntityManagerFactory("dev").createEntityManager();
		Query q =manager.createQuery(qry);
	    q.setParameter(1, name);
	    Hospital h = (Hospital) q.getSingleResult();
	    if(h!=null)
	    {
	    	System.out.println(h.getName());
	    	System.out.println(h.getFounder());
	    	System.out.println(h.getName());
	    }
	    else
	    {
	    	System.out.println("invalid name ENTER");
	    }
	}

}

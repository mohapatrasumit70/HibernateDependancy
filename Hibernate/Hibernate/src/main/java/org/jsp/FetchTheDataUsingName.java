package org.jsp;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.internal.build.AllowSysOut;

public class FetchTheDataUsingName {

	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	System.out.println("ENTER THE NAME TO FIND THE DETAIL");
	String name =sc.next();
	  String qry="select u from user u where name=?1";
      Session s = new Configuration().configure().buildSessionFactory().openSession();
    
      Query<user>  q =s.createQuery(qry);
      q.setParameter(1, name);
      List <user> users = q.getResultList();
      if(users.size()>0)
      {
    	  for(user u :users) {
    	  System.out.println("ID :"+u.getId());
    	  System.out.println("ID :"+u.getName());
    	  System.out.println("ID :"+u.getAge());
    	  System.out.println("ID :"+u.getPhone());
    	  System.out.println("ID :"+u.getPassword());
    	  }
    	
      }
      else
      {
    	 System.err.println("YOU ARE ENTERED INVALDI ID");
      }
	}

}

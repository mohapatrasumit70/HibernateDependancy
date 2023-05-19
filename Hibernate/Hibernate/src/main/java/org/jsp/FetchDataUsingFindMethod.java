package org.jsp;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

public class FetchDataUsingFindMethod {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your id to Fetch The Data");
		int id =sc.nextInt();

		Session s = new Configuration().configure().buildSessionFactory().openSession();
		user u = s.find(user.class,id);
	    if(u!=null)
	    {
	    	System.out.println(u.getName());
	    	System.out.println(u.getAge());
	    	System.out.println(u.getPhone());
	    	System.out.println(u.getPassword());
	    }
	    else 
	    	System.out.println("you are Ewnter Invalid id");
		
	}

}

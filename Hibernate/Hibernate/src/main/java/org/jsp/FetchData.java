package org.jsp;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

public class FetchData {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The ID : ");
		int id =sc.nextInt();
       System.out.println("Your Data");
       Session s = new Configuration().configure().buildSessionFactory().openSession();
        user u =s.get(user.class,id);
        if(u!=null)
        {
        	System.out.println("ID :"+u.getId());
        	System.out.println("NAME : "+u.getName());
        	System.out.println("AGE : "+u.getAge());
        	System.out.println("PHONE : "+u.getPhone());	
        }
        else {
        System.err.println("you are enter Invalid ID");
        }
        
	}

}

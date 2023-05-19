package org.jsp;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DeteleTheRecord {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER THE ID FOR DELETE THE DATA");
		int id =sc.nextInt();
		Session s =new Configuration().configure().buildSessionFactory().openSession();
	user u =s.get(user.class,id);
	if(u!=null) {
		s.delete(u);
	Transaction t =s.beginTransaction();
	t.commit();
System.out.println("your record is deleted ");
	}
	else
	{
	System.out.println("YOU ARE ENTER INVALID ID");
	}
		
		}

}

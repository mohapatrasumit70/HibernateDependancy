package org.jsp;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RegisterOrUpdateTheData {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the id");
		user u =new user();
		int id =sc.nextInt();
		System.out.println("ENTER THE NAME,AGE,PHONE,PASSWORD");
		String name = sc.next();
		int age =sc.nextInt();
		long phone =sc.nextLong();
		String password = sc.next();
		u.setName(name);
		u.setAge(age);
		u.setPhone(phone);
		u.setPassword(password);
		Session s = new Configuration().configure().buildSessionFactory().openSession();
		s.saveOrUpdate(u);
		Transaction t=s.beginTransaction();
		t.commit();
		System.out.println("your data is updated");
	} 
}

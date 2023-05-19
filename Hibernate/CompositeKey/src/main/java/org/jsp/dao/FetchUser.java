package org.jsp.dao;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class FetchUser {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int id =sc.nextInt();
		EntityManager manager = Persistence.createEntityManagerFactory("dev").createEntityManager();
		long phone =sc.nextLong();
		String Password=sc.next();
		UserId ID = new UserId();
		UserId u =manager.find(UserId.class, 1);
		ID.setEmail("1@gmail.com");
		ID.setPhone(96586564);
		if(u!=null)

		{
			System.out.println(u.getEmail());
			System.out.println(u.getPhone());
		}
		else 
		{
			System.err.println("Invalid id or password");
		}
	}

}

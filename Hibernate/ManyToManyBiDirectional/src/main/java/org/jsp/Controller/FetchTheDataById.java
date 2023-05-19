package org.jsp.Controller;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.jsp.dao.Batch;

public class FetchTheDataById {

	public static void main(String[] args) {
		EntityManager manager = Persistence.createEntityManagerFactory("dev").createEntityManager();
		Scanner sc = new Scanner (System.in);
		System.out.println("enter the Student id to petch Data");
		int id = sc.nextInt();
		String qry ="select b from Batch b where b.students.id =?1";
		Query q=manager.createQuery(qry);
		q.setParameter(1, id);
		List <Batch> l=q.getResultList();
		if(l.size()>0)
		{
			for(Batch bl:l)
			{
				System.out.println(bl);
			}
		}
		else
		{
			System.out.println("INVALID ID");
		}

	}

}

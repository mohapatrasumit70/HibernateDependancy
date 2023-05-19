package org.jsp.Controller;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;

import orj.jsp.dao.Batch;
import orj.jsp.dao.Student;

public class FetchByStudentId {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the id for fetch the data");
		int id=sc.nextInt();
		EntityManager manager = Persistence.createEntityManagerFactory("dev").createEntityManager();
		String qry ="select b1 from Batch b1 where b1.id =?1";
		Query  q  = manager.createQuery(qry);
		q.setParameter(1, id);
		List<Batch>s =q.getResultList();
		if(s.size()>0)
		{
			for(Batch b:s) {
				System.out.println(b.getSubject());
			}
		}
		else
			System.out.println("invalid ID");

	}

}

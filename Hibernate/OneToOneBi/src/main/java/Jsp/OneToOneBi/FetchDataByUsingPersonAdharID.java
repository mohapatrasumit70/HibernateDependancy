package Jsp.OneToOneBi;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FetchDataByUsingPersonAdharID {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("ENTER YOUR ADHAR ID TO KNOW THE DETAILS");
		int aid = sc.nextInt();
		EntityManager manager = Persistence.createEntityManagerFactory("dev").createEntityManager();
		Person p = new Person();
		AdharCard card =new AdharCard();
		String qry="select a.p from AdharCard a where a.p.id=?1";
		Query q =manager.createQuery(qry);
		q.setParameter(1, aid);
		Person p1=(Person)q.getSingleResult();
		if(p1!=null)
		{
		
			System.out.println(p1.getName());
			System.out.println(p1.getPhone());
			System.out.println(p1.getCard());
			
			
		}
		else 
		{
			System.err.println("  ENTER INVALID ID  ");
		}
	}

}

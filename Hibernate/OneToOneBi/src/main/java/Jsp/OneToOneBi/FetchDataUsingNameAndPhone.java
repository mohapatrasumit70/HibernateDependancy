package Jsp.OneToOneBi;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FetchDataUsingNameAndPhone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
//String name =sc.next();
System.out.println("enter your id and phone");
int id=sc.nextInt();
long phone =sc.nextLong();

EntityManager manager = Persistence.createEntityManagerFactory("dev").createEntityManager();
String qry ="select p from Person p where p.id=?1 and p.phone=?2";
Query q =manager.createQuery(qry);
q.setParameter(1, id);
q.setParameter(2, phone);
//Person a =(Person) q.getSingleResult();
List a = q.getResultList();
if(a!=null)
{
	System.out.println(((Person) a).getName());
}
else
{
	System.out.println("Invalid phone");
}
	}

}

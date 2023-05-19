package Jsp.OneToOneBi;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class FetchTheDataUsingFind {

	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
    System.out.println("enter the Adhar id to fetch the data");
    int aid =sc.nextInt();
    EntityManager manager =Persistence.createEntityManagerFactory("dev").createEntityManager();
    AdharCard card = manager.find(AdharCard.class,aid);
    if(card!=null)
    {
    	Person p =card.getP();
    	System.out.println(p.getId());
    	System.out.println(p.getName());
    	System.out.println(p.getPhone());
    }
    else
    {
    	System.err.println("INVALID ID ENTER ");
    }
	}

	

}

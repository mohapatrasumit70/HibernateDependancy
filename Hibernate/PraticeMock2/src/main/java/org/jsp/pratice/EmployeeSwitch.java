package org.jsp.pratice;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class EmployeeSwitch {
	static Scanner sc =new Scanner(System.in);
	static EntityManager manager = Persistence.createEntityManagerFactory("dev").createEntityManager();
	public static void main(String[] args) {
	
     System.out.println(" SELECT 1 FOR SAVEDATA");
     System.out.println(" SELECT 2 FOR UPDATEDATA");
     System.out.println(" SELECT 3 FOR FINDDATA");
     System.out.println(" SELECT 4 FOR LOGINDATA");
     System.out.println(" SELECT 5 FOR DELETEDATA");
     System.out.println("enter your for CRUD ");
     int select =sc.nextInt();
     switch(select)
     {
     case 1:{savedata();break;}
     case 2:{Updatedata();break;}
     case 3:{FindData();break;}
     case 4:{LoginData();break;}
     case 5:{DeleteData();break;}
     default :{System.out.println("INVALID ID");}
     }
	}
	private static void Updatedata() {
		System.out.println("enter your id");
		int id =sc.nextInt();
		System.out.println("enter your name password  phone salary  ");
		String name=sc.next();
		String password =sc.next();
		long phone =sc.nextLong();
		double salary=sc.nextDouble();
		Employee e= new Employee();
		e.setId(id);
		e.setName(name);
		e.setSalary(salary);
		e.setPhone(phone);
		e.setPassword(password);
		manager.merge(e); 
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		transaction.commit();
	}
	private static void DeleteData() {
		System.out.println("ENTER THE ID FOR DELETE DATA");
		int id =sc.nextInt();
	Employee e = manager.find(Employee.class, id);
	if(e!=null)
	{
		manager.remove(e);
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		transaction.commit();
	}
	else
	{
		System.out.println("Invalid id");
	}	
	}
	private static void LoginData() {
		System.out.println("enter your phone and password ");
		long phone =sc.nextLong();
	    String password =sc.next();
	   Query q =manager.createQuery("select e from Employee e where e.phone=?1 and e.password=?2");
	   q.setParameter(1, phone);
	   q.setParameter(2, password);
	   List<Employee> emp =q.getResultList();
	   if(emp.size()>0)
	   {
		   System.out.println("login Successfull");
	   }
	   else {
		   System.out.println("invalid id");
	   }
	}
	private static void FindData() {
		System.out.println("ENTER THE ID FOR FIND DATA");
		int id =sc.nextInt();
	Employee e = manager.find(Employee.class, id);
	if(e!=null)
	{
    System.out.println(e.getName());
    System.out.println(e.getPhone());
    System.out.println(e.getSalary());
	}
	else
	{
		System.out.println("Invalid id");
	}
		
	}
	private static void savedata() {
		System.out.println("enter your name salary phone password");
		String name=sc.next();
		String password =sc.next();
		long phone =sc.nextLong();
		double salary=sc.nextDouble();
		Employee e= new Employee();
		e.setName(name);
		e.setSalary(salary);
		e.setPhone(phone);
		e.setPassword(password);
		manager.persist(e);	
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		transaction.commit();
	}

}

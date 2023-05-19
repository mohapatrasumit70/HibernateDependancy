package org.jsp.controller;

import java.util.Scanner;

import org.jsp.dao.StudentsDao;
import org.jsp.dto.Students;

public class StudentsContrller {
	static Scanner sc = new Scanner(System.in);
	static StudentsDao dao = new StudentsDao();
	public static void main(String[] args) {
		System.out.println("1 = for Save Data");
		System.out.println("2 = for UpDate Data");
		System.out.println("3 = for Delete Data");
		System.out.println("4 = for FInd Data");
		System.out.println("5 = for login Data");
	  int select =sc.nextInt();
	  switch(select) {
	  case 1: {saveData();break;}
	  case 2:{ UpdateData();break;}
	  case 3: {DeleteData();break;}
	  case 4:{findData();break;}
	  case 5:{LoginData();break;}
	  default :System.out.println("INVALID CHOICE");
	  }
	}
	private static void findData() {
		System.out.println("enter ypur id find the data");
		int id =sc.nextInt();
	Students s =dao.findstudents(id);
	if(s!=null)
	{
		System.out.println(s.getId());
		System.out.println(s.getName());
		System.out.println(s.getPercent());
		System.out.println(s.getPhone());
	}
		
	}
	private static void LoginData() {
		System.out.println("ENTER PHONE AND PASSWORD");
		long phone =sc.nextLong();
		String password =sc.next();
		Students s= dao.verifyStudents(phone, password);
				{
			if(s!=null)
			{
				System.out.println("login Succesfull");
				System.out.println("NAME"+s.getName());
			}else {
				System.out.println("invalid phone AND PASSWORD ENTER ");
			}
				}
	}
	private static void DeleteData() {
		System.out.println("ENTER THE ID TO DELETE DATA");
		int id =sc.nextInt();
		boolean res =dao.Delete(id);
		if(res)
		{
			System.out.println(id+" is delete ");
		}
		else {
			System.out.println(id+"is invalid");
		}
		
	}
	private static void UpdateData() {
		System.out.println("ENTER YOUR ID");
		int id=sc.nextInt();
		System.out.println("ENTER YOUR NAME,PASSWORD,PERCENT,PHONE,");
		String name=sc.next();
		String password =sc.next();
		double percent =sc.nextDouble();
		long phone =sc.nextLong();
		Students s = new Students();
		s.setName(name);
		s.setPercent(percent);
		s.setPhone(phone);
		s.setPassword(password);
		s = dao.UpdateData(s);
	}
	private static void saveData() {
		System.out.println("enter your name ,paassword,percent,phone");
		String name=sc.next();
		String password =sc.next();
		double percent =sc.nextDouble();
		long phone =sc.nextLong();
	
		Students s = new Students();
		s.setName(name);
		s.setPercent(percent);
		s.setPhone(phone);
		s.setPassword(password);
		s=dao.UpdateData(s);
	}

}

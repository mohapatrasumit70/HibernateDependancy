package org.jsp.spring.controller;

import java.util.Scanner;

import org.jsp.spring.dao.UserDao;
import org.jsp.spring.dto.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.orm.hibernate5.HibernateTemplate;

public class UserSaveData {
static Scanner sc = new Scanner(System.in);
static UserDao dao;
static {
	ApplicationContext context = new ClassPathXmlApplicationContext("hibernate-spring.xml");
	dao=context.getBean(UserDao.class);
}
	public static void main(String[] args) {

		System.out.println("1 : SAVE USER");
		System.out.println("2 : UPDATE USER");
		System.out.println("3 : FETCH USER USER");
		System.out.println("4 : Delete USER");
		int select =sc.nextInt();
switch(select)
{
case 1:{saveUser();break;}
case 2:{UpdateUser();break;}
case 3:{FetchUser();break;}
case 4:{DeleteUser();break;}
}

	
	
	}
	private static void DeleteUser() {
		System.out.println("ENTER THE ID TO FETCH THE DATA");
		int id =sc.nextInt();
		boolean res  = dao.DeleteUser(id);
		if(res)
		{
			System.out.println("Record is delete successfully");
		}else {
			System.out.println("Invalid id");
		}
		
	}
	private static void FetchUser() {
		System.out.println("ENTER THE ID TO FETCH THE DATA");
		int id =sc.nextInt();
		User u = dao.fetchdata(id);
		if(u!=null)
		{
			System.out.println(u.getId());
			System.out.println(u.getName());
			System.out.println(u.getPhone());
			System.out.println(u.getPassword());
		}else {
			System.out.println("Invalid id");
		}
		
		
	}
	private static void saveUser() {
		User u =new User();
		u.setId(1);
		u.setName("sujit");
		u.setPhone(89089);
		u.setPassword("sujit123");
		dao.SaveUser(u);
	}
	private static void UpdateUser() {
		User u =new User();
		u.setName("sumit");
		u.setPhone(9658);
		u.setPassword("sumit123");
		dao.UpdateUser(u);	
	
}
}
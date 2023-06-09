package org.jsp.Controller;

import java.util.Scanner;

import org.hibernate.event.spi.SaveOrUpdateEvent;
import org.jsp.dao.UserDao;
import org.jsp.dto.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Controller {
	static Scanner sc = new Scanner(System.in);
	static UserDao dao;
	static {
		ApplicationContext context = new AnnotationConfigApplicationContext("org.jsp");
		dao=context.getBean(UserDao.class);
	}
public static void main(String[] args) 
{
	System.out.println(" 1 : Save User ");
	System.out.println(" 2 : update User ");
	System.out.println(" 3 : Verify User By Phone and Password ");
	System.out.println(" 4 : Delete User by Id ");
	int choice =sc.nextInt();
	switch(choice)
	{
	case 1:{
		Save();
	}
	case 2:{
		UpdateData();
	}
	case 3:{
		VerifyUserByphoneAndPassword();
	}
	case 4:{
		DeleteUser();
	}
	
	}
}
private static void DeleteUser() {
	System.out.println("enter yur id to delete");
	int id=sc.nextInt();
	Boolean res=dao.deleteUser(id);
	if(res) {
		System.out.println("Id is Delete");
	}
}
private static void VerifyUserByphoneAndPassword() {
	System.out.println("Enter Phone And Password");
long phone=sc.nextLong();
String password=sc.next();
User u = dao.VerifyUser(phone, password);
if(u!=null)
{
	System.out.println("login done");
	System.out.println(u.getName());
	System.out.println(u.getPhone());
	System.out.println(u.getPassword());
	System.out.println(u.getEmail());
}

}
private static void UpdateData() {
	System.out.println("ENTER ID FOR UPDATE DATA");
	int id=sc.nextInt();
	System.out.println("Enter Name,Phone,Email and Password");
	String name =sc.next();
	long phone =sc.nextLong();
	String email =sc.next();
	String password = sc.next();
	User u = new User();
	u.setId(id);
	u.setName(name);
	u.setPhone(phone);
	u.setEmail(email);
	u.setPassword(password);
	u=dao.UpdateUser(u);
}
private static void Save() {
	System.out.println("Enter Name,Phone,Email and Password");
	String name =sc.next();
	long phone =sc.nextLong();
	String email =sc.next();
	String password = sc.next();
	User u = new User();
	u.setName(name);
	u.setPhone(phone);
	u.setEmail(email);
	u.setPassword(password);
	u=dao.SaveUser(u);
}
}

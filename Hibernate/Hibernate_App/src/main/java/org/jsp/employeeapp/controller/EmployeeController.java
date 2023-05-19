package org.jsp.employeeapp.controller;

import java.util.Scanner;

import org.jsp.employeeapp.dao.EmployeeDao;
import org.jsp.employeeapp.dto.Employee;

class EmployeeController {
	static Scanner sc = new Scanner(System.in);
	static EmployeeDao dao = new EmployeeDao();

	public static void main(String[] args) {

		System.out.println("1: RESISTER AND SAVE");
		System.out.println("3:UPDATE DATA");
		System.out.println("2  ; UPDATE THE DATA");
		int choice = sc.nextInt();
		switch (choice) {
		case 1: {
			register();
			break;
		}
		case 2: {
			login();
			break;
		}
		case 3: {
			update();
		}
		case 4: {
			delete();
		}
		default: {
			System.out.println("Invalid Choice");
		}
		}

	}

	private static void register() {
		System.out.println("ENTER NAME ,DESG SALARY");
		String name = sc.next();
		String desg = sc.next();
		double salary = sc.nextDouble();
		long phone = sc.nextLong();
		String Password = sc.next();
		Employee e = new Employee();
		e.setName(name);
		e.setDesg(desg);
		e.setPhone(phone);
		e.setSalary(salary);
		e.setPassword(Password);
		e = dao.SavaEmployee(e);
		System.out.println("Employee data save Id id : " + e.getId());
	}

	private static void login() {
		System.out.println("ENTER THE PHONE AND PASSWORD");
		long phone = sc.nextLong();
		String Password = sc.next();
		Employee e = dao.verify(phone, Password);
		if (e != null) {
			System.out.println("Login Succesfull");
			System.out.println("Name" + e.getName());
		} else {
			System.out.println("Invalid Phone Number Or Password");
		}
	}

	private static void update() {
		System.out.println("enter the ID  For Any Update");
		int id = sc.nextInt();
		System.out.println("Enter name ,desg,salary,phone,password");
		String name = sc.next();
		String desg = sc.next();
		double salary = sc.nextDouble();
		long phone = sc.nextLong();
		String Password = sc.next();
		Employee e = new Employee();
		e.setName(name);
		e.setDesg(desg);
		e.setPhone(phone);
		e.setSalary(salary);
		e.setPassword(Password);
		e = dao.UpdateEmployee(e);
	}

	private static void delete() {
		System.out.println("enter the ID  For Any Update");
		int id = sc.nextInt();
		boolean res = dao.deleteEmployee(id);
		if (res) {
			System.out.println(id + " :id is delete successfully");
		} else {
			System.out.println(id + " :id is invaild");
		}
	}
}

package org.jsp.ShoppingKart.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.jsp.ShoppingKart.dao.UserDao;
import org.jsp.ShoppingKart.dto.User;

public class ResisterServlet extends HttpServlet {
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String name=req.getParameter("nm")	;
	String email=req.getParameter("em")	;
	String password=req.getParameter("ps")	;
	String gender=req.getParameter("gender");
	int age =Integer.parseInt(req.getParameter("age"));
	long phone =Long.parseLong(req.getParameter("phone"));
	User u = new User();
	u.setName(name);
	u.setAge(age);
	u.setGender(gender);
    u.setPhone(phone);
    u.setPassword(password);
	UserDao dao=new UserDao();    
	u=dao.SaveUser(u);
	PrintWriter writer =resp.getWriter();
	writer.write("<html><body><h2>Login Succsesesfull</h2></body></html>");
	}
}

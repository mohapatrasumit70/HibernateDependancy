package org.jsp.ShoppingKart.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.jsp.ShoppingKart.dao.UserDao;
import org.jsp.ShoppingKart.dto.User;

public class DeleteuserServlet  extends HttpServlet{
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	HttpSession session = req.getSession();
	User u =(User)session.getAttribute("user");
	if(u!=null)
	{
		int id =u.getId();
		UserDao dao  = new UserDao();
		dao.deleteuser(id);
		session.invalidate();
		req.setAttribute("msg", "Your ACcount is delete");
		RequestDispatcher dispatcher = req.getRequestDispatcher("login.jsp");
		dispatcher.forward(req, resp);
	}else
	{
		resp.sendRedirect("login.jsp");
	}
}
}

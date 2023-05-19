package org.jsp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
public class MainTest {
	public static void main(String[] args) {
		user u = new user();
		u.setName("sumit");
		u.setAge(26);
		u.setPhone(9658);
        u.setPassword("a123");
        Configuration cfg = new Configuration().configure();
        SessionFactory factory =cfg.buildSessionFactory();
        Session s = factory.openSession();
        s.save(u);
        Transaction t=s.beginTransaction();
        t.commit();
        System.out.println("user save data with Id"+ u.getId());
	}
}

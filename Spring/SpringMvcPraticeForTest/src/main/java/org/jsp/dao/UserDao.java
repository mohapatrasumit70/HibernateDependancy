package org.jsp.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.transaction.Transaction;

import org.jsp.dto.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Repository
public class UserDao {
	@Autowired
private EntityManager manager;

public User saveUser(User user)
{
	EntityTransaction transaction =manager.getTransaction();
	manager.persist(user);
	transaction.begin();
	transaction.commit();
	return user;
}
public User updateUser(User user)
{
	EntityTransaction transaction =manager.getTransaction();
	manager.merge(user);
	transaction.begin();
	transaction.commit();
	return user;
}

public User verifyUser(long phone, String password) {
	String hql="select u from User u where u.phone=?1 and u.password=?2 ";
	Query q =manager.createQuery(hql);
	q.setParameter(1, phone);
	q.setParameter(2, password);
	try {
		return (User) q.getSingleResult();
	}
	catch(NoResultException e)
	{
		return null;
	}
}
public boolean DeleteUser(int id) {
	EntityTransaction transaction = manager.getTransaction();
	User u =manager.find(User.class,id);
	if(u!=null) {
		manager.remove(u);
		transaction.begin();
		transaction.commit();
		return true;
	}
	return false;
	
}
}

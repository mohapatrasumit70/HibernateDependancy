package org.jsp.ShoppingKart.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.jsp.ShoppingKart.dto.User;

public class UserDao {

		EntityManager manager = Persistence.createEntityManagerFactory("dev").createEntityManager();
		
		public User SaveUser(User user)
		{
			manager.persist(user);	
			EntityTransaction transaction =manager.getTransaction();
			transaction.begin();
			transaction.commit();
			return user;	
		}
	public User updateUser(User user) {
		manager.merge(user);
		EntityTransaction transaction=manager.getTransaction();
		transaction.begin();
		transaction.commit();   
		return user;
	}
	public User findUser(int id)
	{
		return manager.find(User.class, id);
	}
	public User verifyUser(long phone,String password)
	{
		Query q =manager.createQuery("select u from user u where u.id=?");
		q.setParameter(1, phone);
		q.setParameter(2, password);
		try {
			return(User) q.getSingleResult();
		}catch (NoResultException e) {
			return null;
		}
	}
public boolean deleteuser(int id)
{
	User u = findUser(id);
	manager.remove(u);
	return true;
}
}

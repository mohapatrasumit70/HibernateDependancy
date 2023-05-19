package org.jsp.spring.dao;

import org.jsp.spring.dto.User;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Transactional;

public class UserDao extends HibernateDaoSupport {
@Transactional
public User SaveUser(User user)
{
	getHibernateTemplate().save(user);
	return user;
}
@Transactional
public User UpdateUser(User user)
{
	getHibernateTemplate().update(user);
	return user;
}
@Transactional
public User fetchdata(int id)
{
	return getHibernateTemplate().get(User.class,id);
	
}

@Transactional
public Boolean  DeleteUser(int id)
{
	User u= getHibernateTemplate().get(User.class, id);
	if(u!=null) {
		getHibernateTemplate().delete(u);
		return true;
	}
	return false;
}
}

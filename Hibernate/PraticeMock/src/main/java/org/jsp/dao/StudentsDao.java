package org.jsp.dao;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.hibernate.event.internal.MergeContext;
import org.jsp.dto.Students;

public class StudentsDao {
EntityManager manager = Persistence.createEntityManagerFactory("dev").createEntityManager();

public Students saveData(Students std)
{
	manager.persist(std);
	EntityTransaction transaction =manager.getTransaction();
	transaction.begin();
	transaction.commit();
	return std;
}
public Students UpdateData(Students std)
{
	manager.merge(std);
	EntityTransaction transaction =manager.getTransaction();
	transaction.begin();
	transaction.commit();
	return std;
}
public Students findstudents(int id)
{
	return manager.find(Students.class, 1);
}
public Boolean Delete(int id)
{
	Students s= manager.find(Students.class, 1);
	if(s!=null)
	{
		manager.remove(s);
		EntityTransaction transaction=manager.getTransaction();
		transaction.begin();
		transaction.commit();
	}
	return true;
}
public Students verifyStudents(long phone ,String password)
{
	String hql="select s from Students s where s.phone=?1 and s.password=?2";
	Query  q=manager.createQuery(hql);
	q.setParameter(1, phone);
	q.setParameter(2, password);
	List< Students> student=q.getResultList();
	if(student.size()>0)
	student.get(0);
	return null;
	}

}

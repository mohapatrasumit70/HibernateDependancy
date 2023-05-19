package org.jsp.Controller;

import java.util.ArrayList;
import java.util.Arrays;

import javax.naming.ldap.ManageReferralControl;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.jsp.dao.Batch;
import org.jsp.dao.Student;

public class SaveStudent {

	public static void main(String[] args) {
		Batch b1 = new Batch();
		b1.setSubject("Hibernate");
		b1.setCode("HEJA35");
		
		Batch b2 = new Batch();
		b2.setSubject("j2ee");
		b2.setCode("HEJ85");
		
		
		Batch b3 = new Batch();
		b3.setSubject("Servlet");
		b3.setCode("HEJA55");
		
		Student s1 = new Student();
		s1.setName("Rohit");
		s1.setPercent(85.7);
		
		Student s2 = new Student();
		s2.setName("Kohli");
		s2.setPercent(85.7);
		
		
		Student s3 = new Student();
		s3.setName("MSD");
		s3.setPercent(85.7);
		
		s1.setBatches(new ArrayList<Batch>(Arrays.asList(b1,b2,b3)));
		s2.setBatches(new ArrayList<Batch>(Arrays.asList(b1,b2,b3)));
		s3.setBatches(new ArrayList<Batch>(Arrays.asList(b1,b2,b3)));
		
		b1.setStudents(new ArrayList<Student>(Arrays.asList(s1,s2,s3)));
		b2.setStudents(new ArrayList<Student>(Arrays.asList(s1,s2,s3)));
		b3.setStudents(new ArrayList<Student>(Arrays.asList(s1,s2,s3)));
		
		EntityManager manager = Persistence.createEntityManagerFactory("dev").createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		
		manager.persist(b1);
		manager.persist(b2);
		manager.persist(b3);
		transaction.begin();
		transaction.commit();
			}

}

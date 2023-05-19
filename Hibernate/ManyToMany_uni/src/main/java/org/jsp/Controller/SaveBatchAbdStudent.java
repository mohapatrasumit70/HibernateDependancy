package org.jsp.Controller;

import java.util.ArrayList;
import java.util.Arrays;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import orj.jsp.dao.Batch;
import orj.jsp.dao.Student;


public class SaveBatchAbdStudent {

	public static void main(String[] args) {
	Batch b1 = new Batch();
	b1.setSubject("HTML");
	b1.setCode("SEJB5");

	Batch b2 = new Batch();
	b2.setSubject("CSS");
	b2.setCode("SEJAB1");

	Batch b3 = new Batch();
	b3.setSubject("JavaScript");
	b3.setCode("SEJB37");

	Student s1 = new Student();
	s1.setName("Rishab");
	s1.setPecent(86.4);
	
	Student s2 = new Student();
	s2.setName("gill");
	s2.setPecent(93.4);
	
	
	Student s3 = new Student();
	s3.setName("rahul");
	s3.setPecent(56.4);
	b1.setStudents( new ArrayList<Student>(Arrays.asList(s1,s2,s3)));
	b2.setStudents( new ArrayList<Student>(Arrays.asList(s1,s2,s3)));
	b3.setStudents( new ArrayList<Student>(Arrays.asList(s1,s2,s3)));
	EntityManager manager = Persistence.createEntityManagerFactory("dev").createEntityManager();
	EntityTransaction t = manager.getTransaction();
	manager.persist(b1);
	manager.persist(b2);
	manager.persist(b3);
	t.begin();
	t.commit();
 }

}

package org.jsp.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveQuestion {

	public static void main(String[] args) {
	EntityManager manager =Persistence.createEntityManagerFactory("dev").createEntityManager();
	EntityTransaction t = manager.getTransaction();
	Question q = new Question();
	q.setQuestion("what is Java");
	q.setQuestionBy("trainer");
	Answer a1 = new Answer();
	a1.setAnswers("java is a object oriented language");
    a1.setAnswerBy("Student1");
    a1.setQ(q);
	Answer a2 = new Answer();
	a2.setAnswers("java is platformIndepend lanuage");
    a2.setAnswerBy("Student1");
    a2.setQ(q);
	Answer a3 = new Answer();
	a3.setAnswers("java is a programing language");
    a3.setAnswerBy("Student1");
    a3.setQ(q);
    manager.persist(a1);
    manager.persist(a2);
    manager.persist(a3);
    t.begin();
    t.commit();
	}
}

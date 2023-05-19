package org.jsp.dao;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
@Entity
public class Answer {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
private String answers;
private String answerBy;
@ManyToOne(cascade = CascadeType.ALL)
private Question q;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getAnswers() {
	return answers;
}
public void setAnswers(String answers) {
	this.answers = answers;
}
public String getAnswerBy() {
	return answerBy;
}
public void setAnswerBy(String answerBy) {
	this.answerBy = answerBy;
}
public Question getQ() {
	return q;
}
public void setQ(Question q) {
	this.q = q;
}
}

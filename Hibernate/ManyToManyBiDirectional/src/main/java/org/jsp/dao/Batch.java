package org.jsp.dao;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Batch {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
private String Subject, code;

@ManyToMany(cascade = CascadeType.ALL)
@JoinTable(name="BatchAndStudent", joinColumns = @JoinColumn(name="BatchAndId"), inverseJoinColumns =@JoinColumn (name="StudentAndId"))
private List<Student>Students;
public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSubject() {
		return Subject;
	}
	public void setSubject(String subject) {
		Subject = subject;
	}
	public List<Student> getStudents() {
		return Students;
	}
	public void setStudents(List<Student> students) {
		Students = students;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	@Override
	public String toString() {
		return "Batch [id=" + id + ", Subject=" + Subject + ", code=" + code + "]";
	}


}

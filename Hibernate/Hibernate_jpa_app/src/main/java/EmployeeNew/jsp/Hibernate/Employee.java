package EmployeeNew.jsp.Hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Table(name="employeeData")
@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
private int id;
private String name;
private long phone;
@Column(name="eId" ,nullable = false)
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
@Column(name="eId" ,nullable = false)
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
@Column(name="eId" ,nullable = false,unique = true)
public long getPhone() {
	return phone;
}
public void setPhone(long phone) {
	this.phone = phone;
}
}

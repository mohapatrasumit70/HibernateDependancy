package Hibernate.jpa.test;

import java.util.jar.Attributes.Name;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Query;
import javax.persistence.Table;
@NamedQueries(@NamedQuery(name="findall", query = "select p from person p"))
@Entity
public class Person {
	private int id;
	private String name;
	private long phone;
	private String password;
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public long getPhone() {
	return phone;
}
public void setPhone(long phone) {
	this.phone = phone;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
@Override
public String toString() {
	return "Person [id=" + id + ", name=" + name + ", phone=" + phone + "]";
}

}

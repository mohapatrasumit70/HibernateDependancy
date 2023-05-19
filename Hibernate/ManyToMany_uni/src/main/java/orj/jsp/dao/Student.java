package orj.jsp.dao;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
private String name;
private double pecent;
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
public double getPecent() {
	return pecent;
}
public void setPecent(double pecent) {
	this.pecent = pecent;
}
@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", pecent=" + pecent + "]";
}

}

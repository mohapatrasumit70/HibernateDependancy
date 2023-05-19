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
public class Student {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY )
private int id;
private String name;
private double percent;
@ManyToMany(cascade = CascadeType.ALL ,mappedBy ="students")
private List<Batch> Batches;

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
public List<Batch> getBatches() {
	return Batches;
}
public void setBatches(List<Batch> batches) {
	Batches = batches;
}
public double getPercent() {
	return percent;
}
public void setPercent(double percent) {
	this.percent = percent;
}
@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", percent=" + percent + "]";
}




}

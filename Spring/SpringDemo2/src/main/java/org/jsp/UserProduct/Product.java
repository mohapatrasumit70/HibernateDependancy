package org.jsp.UserProduct;

public class Product {
private int pid;
private String name;

public int getpId() {
	return pid;
}
public void setId(int pid) {
	this.pid = pid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public void display() {
	System.out.println("ID = " +pid);
	System.out.println("Name = "+ name);
}
public Product(int pid, String name) {

	this.pid = pid;
	this.name = name;
}
public Product() {
	
}

}

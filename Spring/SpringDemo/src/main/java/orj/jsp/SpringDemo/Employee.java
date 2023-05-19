package orj.jsp.SpringDemo;

public class Employee {
private int id;
private String name;
public void display() {
	System.out.println("ID" +id);
	System.out.println("Name"+name);
}
public Employee() {
	
}
public Employee(int id, String name) {

	this.id = id;
	this.name = name;
}
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


}

package orj.jsp.SpringDemo3;

public class Product {
private int id;
private String name;
public void start() {
	System.out.println("product is avilable");
}
public Product(int id, String name) {
	this.id = id;
	this.name = name;
}
public Product() {
	
}
}

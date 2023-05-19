package orj.jsp.SpringDemo3;

public class User {
private Product p;
public Product getP() {
	return p;
}
public User(Product p) {
	this.p = p;
}
public void start() {
	p.start();
}
public User() {
	
}
}

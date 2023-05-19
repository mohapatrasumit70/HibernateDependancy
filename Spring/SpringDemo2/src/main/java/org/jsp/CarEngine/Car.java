package org.jsp.CarEngine;

public class Car {
private Engine e;
public Engine getE() {
	return e;
}
public void setE(Engine e) {
	this.e = e;
}
public void StartEngine() {
	e.start();
}
}

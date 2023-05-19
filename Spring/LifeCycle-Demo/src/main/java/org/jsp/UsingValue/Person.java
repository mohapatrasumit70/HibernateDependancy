package org.jsp.UsingValue;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Person {
@Value(value="26")
private int age;
private String Name;
private long phone;

public Person(@Value(value = "24")long phone) {
	this.phone=phone;
}
@Value(value="Sumit")
public void setName(String name) {
	Name = name;
}


public int getAge() {
	return age;
}

public long getPhone() {
	return phone;
}
@Value(value="9658656493")
public void setPhone(long phone) {
	this.phone = phone;
}

public String getName() {
	return Name;
}


}

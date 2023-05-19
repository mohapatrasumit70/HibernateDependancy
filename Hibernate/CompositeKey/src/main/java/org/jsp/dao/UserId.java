package org.jsp.dao;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class UserId implements Serializable{
private String Email;
private long phone;
public String getEmail() {
	return Email;
}
public void setEmail(String email) {
	Email = email;
}
public long getPhone() {
	return phone;
}
public void setPhone(long phone) {
	this.phone = phone;
}
}

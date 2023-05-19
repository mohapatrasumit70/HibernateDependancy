package org.jsp.ShoppingKart.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
private String name,descripsion,catagory,brand,image;
private Double price;
private User user;
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
public String getDescripsion() {
	return descripsion;
}
public void setDescripsion(String descripsion) {
	this.descripsion = descripsion;
}
public String getCatagory() {
	return catagory;
}
public void setCatagory(String catagory) {
	this.catagory = catagory;
}
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public String getImage() {
	return image;
}
public void setImage(String image) {
	this.image = image;
}
public Double getPrice() {
	return price;
}
public void setPrice(Double price) {
	this.price = price;
}
public User getUser() {
	return user;
}
public void setUser(User user) {
	this.user = user;
}

}

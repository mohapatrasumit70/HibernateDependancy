package org.jsp.dao;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
public class FoodOrder {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
private String Location;
private double cost;
@CreationTimestamp
private LocalDateTime OrderTime;
@UpdateTimestamp
private LocalDateTime DeliverTime;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getLocation() {
	return Location;
}
public void setLocation(String location) {
	Location = location;
}
public double getCost() {
	return cost;
}
public void setCost(double cost) {
	this.cost = cost;
}
public LocalDateTime getOrderTime() {
	return OrderTime;
}
public void setOrderTime(LocalDateTime orderTime) {
	OrderTime = orderTime;
}
public LocalDateTime getDeliverTime() {
	return DeliverTime;
}
public void setDeliverTime(LocalDateTime deliverTime) {
	DeliverTime = deliverTime;
}

}

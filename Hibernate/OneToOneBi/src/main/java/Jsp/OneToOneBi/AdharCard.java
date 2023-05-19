package Jsp.OneToOneBi;
import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity
public class AdharCard {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
private long number;
private LocalDate Dob;
@OneToOne(cascade = CascadeType.ALL,mappedBy = "card")
private Person p;
public Person getP() {
	return p;
}
public void setP(Person p) {
	this.p = p;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public long getNumber() {
	return number;
}
public void setNumber(long number) {
	this.number = number;
}
public LocalDate getDob() {
	return Dob;
}
public void setDob(LocalDate dob) {
	Dob = dob;
}
@Override
public String toString() {
	return "AdharCard [id=" + id + ", number=" + number + ", Dob=" + Dob + "]";
}

}

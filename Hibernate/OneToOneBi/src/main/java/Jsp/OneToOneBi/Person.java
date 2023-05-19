package Jsp.OneToOneBi;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Person {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
private int id;
private String name;
private long Phone;
@OneToOne(cascade = CascadeType.ALL)
@JoinColumn(name="AdharCard_id")
private AdharCard card;  
public int getId()
{
		return id;
	}
	public AdharCard getCard() {
	return card;
}
public void setCard(AdharCard card) {
	this.card = card;
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
	public long getPhone() {
		return Phone;
	}
	public void setPhone(long phone) {
		Phone = phone;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", Phone=" + Phone + "]";
	}

}

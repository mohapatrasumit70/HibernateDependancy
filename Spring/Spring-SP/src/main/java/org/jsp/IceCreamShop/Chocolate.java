package org.jsp.IceCreamShop;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Chocolate implements IceCream {
	public void Eat() {
		System.out.println("Baby Eat CHocolate IceCream");
	}
}

package org.jsp.IceCreamShop;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class Vanila  implements IceCream {
	public void Eat() {
		System.out.println("Baby Eat VaNila IceCream");
	}

}

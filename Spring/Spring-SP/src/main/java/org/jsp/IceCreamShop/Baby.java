package org.jsp.IceCreamShop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Baby {
@Autowired
private IceCream c;
	public IceCream getC() {
		return c;
	}
	public void setC(IceCream c) {
		this.c = c;
	}
}

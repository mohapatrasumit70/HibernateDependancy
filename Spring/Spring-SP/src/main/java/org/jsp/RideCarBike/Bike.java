package org.jsp.RideCarBike;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Bike implements Vehicle{

	public void start() {
	System.out.println("Bike Has been Started");
	}

}

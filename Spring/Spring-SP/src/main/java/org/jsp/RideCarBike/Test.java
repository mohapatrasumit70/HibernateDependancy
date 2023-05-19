package org.jsp.RideCarBike;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext("org.jsp.RideCarBike");
		Ride r = context.getBean(Ride.class);
		r.getV().start();

	}

}

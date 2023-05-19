package orgjsp.VehicleRide;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestVehicleRide {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("VehicleRide.xml");
		Ride r = context.getBean(Ride.class);
		r.StartRide();

	}

}

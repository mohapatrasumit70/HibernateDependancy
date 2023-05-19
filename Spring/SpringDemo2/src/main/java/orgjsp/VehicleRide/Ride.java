package orgjsp.VehicleRide;

public class Ride {
    Vehicle v;
public void StartRide() {
	v.start();
}
public Vehicle getV() {
	return v;
}
public void setV(Vehicle v) {
	this.v = v;
}

}

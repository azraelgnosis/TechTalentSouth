package things;

import stuff.Vehicle;

public class Boat extends Vehicle {
	
	
	public void accelerate(double velocity) {
		this.speed = velocity;
		this.units = "knots";
	}

}

package stuff;

public class Vehicle {
	int wheels;
	double maxSpeed;
	protected double speed;
	protected String units = "m/s";
	
	public void accelerate(double speed) {
		this.speed = speed;
		System.out.println("Accelerating to " + this.speed + this.units);
	}
	
	public void accelerate(double velocity, String unit) {
		this.speed = velocity;
		this.units = unit;
		System.out.println("Accelerating to " + this.speed + this.units);
	}
}

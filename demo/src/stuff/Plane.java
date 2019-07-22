package stuff;

public class Plane extends Vehicle {
	static int num;
	private int id;
	String type;
	private boolean inFlight;
	
	static final String JET = "Jet";
	static final String PASSENGER = "Passenger";
	
	// constructors
	public Plane() {}
	public Plane(String type) {}
	
	public boolean isFlying() { return this.inFlight; }
	
	public void takeOff() { 
		if (this.speed > 10000) {
			this.inFlight = true; 
			System.out.println("Flying!!!");
		} else {
			System.out.println("Not going fast enough!!!!");
		}
	}
	
	
	// getters/setters
	public static int getNum() {
		return num;
	}
	public static void setNum(int num) {
		Plane.num = num;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getSpeed() {
		return speed;
	}
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	public boolean isInFlight() {
		return inFlight;
	}
	public void setInFlight(boolean inFlight) {
		this.inFlight = inFlight;
	}
	@Override
	public String toString() {
		return "Plane [id=" + id + ", type=" + type + ", speed=" + speed + ", inFlight=" + inFlight + "]";
	}
	
	


}

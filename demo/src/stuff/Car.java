package stuff;

public class Car extends Vehicle{
	// fields
	static final int numOfTires = 4;
	String brand;
	int year;
	String color;
	
	// constructors
	public Car() {
	}
	public Car(String brand) {
		this.brand = brand;
	}
	public Car(int year) {
		this.year = year;
	}
	public Car(String brand, String color) {
		this.brand = brand;
		this.color = color;
		this.year = 2019;
		this.speed = 0;
	}
	
	// methods

}

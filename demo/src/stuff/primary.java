package stuff;

public class primary {
	public static void main(String[] args) {
		// Type Name = new Type(parameters);
		Car car1 = new Car("Toyota", "Grey");
		car1.color = "Grey";
		car1.accelerate(30);
		car1.accelerate(15, "mph");
		
		Car carA = new Car();
		carA.brand = "Honda";
		carA.color = "Pink";
		
		Plane soar = new Plane();
		System.out.println(soar.t)
	}

}

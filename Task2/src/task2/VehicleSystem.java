package task2;

class Vehicle{
	String brand = "Generic";
	int speed = 80;
	
	void showdetails() {
		System.out.println("Brand: " + brand + ", Speed: " + speed + "Kmph");
	}
}

class Car extends Vehicle{
	int wheels = 4;
}

class Bike extends Vehicle {
	int wheels = 2;
}

public class VehicleSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c = new Car();
		c.brand = "BWM";
		c.speed = 200;
		c.showdetails();
		
		Bike b = new Bike();
		b.brand = "Royal Endfield";
		b.speed = 120;
		b.showdetails();
	}

}

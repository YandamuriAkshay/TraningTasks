package task3;

class Vehicle {
    final void engineType() {
        System.out.println("Default Engine: Petrol");
    }
}

class Car extends Vehicle {
    /*
    @Override
    void engineType() {
        System.out.println("Engine: Diesel");
    }
    */
}

public class FinalMethodT32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car car = new Car();
        car.engineType();
	}

}

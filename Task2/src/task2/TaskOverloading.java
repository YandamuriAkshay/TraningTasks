package task2;

class Calculator{
	int add(int a, int b) {
		return a + b;
	}
	
	double add (double a, double b) {
		return a + b;
	}
	
	String add(String a, String b) {
		return a + b;
	}
}
public class TaskOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c = new Calculator();
		System.out.println("Int add    : " + c.add(4, 6));
		System.out.println("Int Double : " + c.add(2.9, 3.5));
		System.out.println("Int String : " + c.add("Hi, ", "Akshay!!"));
	}

}

package task3;

abstract class Shape{
	abstract double area();
}

class Circle extends Shape {
	double radius;
	
	Circle (double r) {
		this.radius = r;
	}
	
	double area () {
		return Math.PI * radius * radius;
	}
}

class Rectangle extends Shape {
	double length, breadth;
	
	Rectangle (double l, double b){
		this.length = l;
		this.breadth = b;
	}
	
	double area() {
		return length * breadth;
	}
}

public class AbstractClassT1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s1 = new Circle(5);
		Shape s2 = new Rectangle(4, 6);
		
		System.out.println("Circle Area: " + s1.area());
		System.out.println("Rectangle Area " + s2.area());

	}

}

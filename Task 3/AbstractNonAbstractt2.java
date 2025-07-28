package task3;

abstract class Animal { 
	abstract void sound(); 
	
	void displayType() { 
		System.out.println("This is an animal."); 
		} 
} 
class Dog extends Animal { 
	void sound() { 
		System.out.println("Dog says: Bow Bow!"); 
		} 
}
public class AbstractNonAbstractt2 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a = new Dog(); 
		a.sound(); 
		a.displayType();
	}

}

package task2;

class Animal {
	void sound() {
		System.out.println("Animal Sound");
	}
}

class Dog extends Animal{
	void sound() {
		System.out.println("Bow Bow");
	}
}

class Cat extends Animal{
	void sound() {
		System.out.println("Meow Meow");
	}
}

class Cow extends Animal{
	void sound() {
		System.out.println("Moo Moo");
	}
}

public class TaskOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a1 = new Dog();
		Animal a2 = new Cat();
		Animal a3 = new Cow();
		
		a1.sound();
		a2.sound();
		a3.sound();
	}

}

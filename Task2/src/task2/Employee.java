package task2;

public class Employee {
	static int count = 0;
	String name;
	
	Employee(String name){
		this.name = name;
		count++;
	}
	
	void show () {
		System.out.println(name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee("Akshay");
		Employee e2 = new Employee("Ganesh");
		Employee e3 = new Employee("Kushwanth");
		
		System.out.println("Total Employees : " + Employee.count);
		
		e1.show();
		e2.show();
		e3.show();
		

	}

}

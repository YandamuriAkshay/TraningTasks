import java.util.Scanner;

public class Task9b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Any Two Number :");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println("1. Add  "
				+ "2. Substract "
				+ "3. multiply "
				+ "4. Divide ");
		int choice = sc.nextInt();
		
		switch (choice) {
		case 1: System.out.println("Sum: " + (a + b));
		break;
		
		case 2: System.out.println("Sub: " + (a - b));
		break;
		
		case 3: System.out.println("Multi: " + (a * b));
		break;
		
		case 4: System.out.println("Div: " + (a / b));
		break;
		
		default: System.out.println("Enter Between the Choice Only");
		}

	}

}

import java.util.Scanner;

public class Task9a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number 1: ");
		int a = sc.nextInt();
		
		System.out.println("Enter the Number 2: ");
		int b = sc.nextInt();
		
		System.out.println("Enter the Number 3: ");
		int c = sc.nextInt();
		
		if (a >= b && a >= c) {
            System.out.println("The largest number is: " + a);
        } else if (b >= a && b >= c) {
            System.out.println("The largest number is: " + b);
        } else {
            System.out.println("The largest number is: " + c);
        }
	}

}

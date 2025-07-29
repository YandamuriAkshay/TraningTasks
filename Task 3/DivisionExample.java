package task3;

import java.util.Scanner;

public class DivisionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to divide 100: ");
        int num = sc.nextInt();

        try {
            int result = 100 / num;
            System.out.println("Result: " + result);
        } catch (ArithmeticException ex) {
            System.out.println("Error: Cannot divide by zero.");
        }

        sc.close();
    }

}

import java.util.Scanner;

public class Task9d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int number;
		do {
            System.out.print("Enter a positive number (-1 to stop): ");
            number = sc.nextInt();

            if (number > 0) {
                System.out.println("You entered: " + number);
            } else if (number != -1) {
                System.out.println("Please enter a **positive** number.");
            }

        } while (number != -1);

        System.out.println("Program ended.");
        sc.close();
	}
}

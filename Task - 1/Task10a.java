import java.util.Scanner;

public class Task10a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[10];
		Scanner sc = new Scanner(System.in);
		int sum = 0, min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
		
		System.out.println("Enter TEN numbers: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			sum += arr[i];
			if (arr[i] < min) min = arr[i];
			if (arr[i] > max) max = arr[i];			
		}
		
		System.out.println("Average: " + (sum / 10.0));
		System.out.println("Min: " + min);
		System.out.println("Max: " + max);
	}

}

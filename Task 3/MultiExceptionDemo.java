package task3;

public class MultiExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
            int[] arr = new int[5];
            int result = 10 / 0;  // ArithmeticException
            System.out.println(arr[10]); // ArrayIndexOutOfBoundsException
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic error: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array error: " + e.getMessage());
        }
	}

}

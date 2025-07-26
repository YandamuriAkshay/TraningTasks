package task2;

@FunctionalInterface
interface MathOperation {
	int operate(int a, int b);
}

public class LambdaTask11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MathOperation add = (a, b) -> a + b;
		MathOperation sub = (a, b) -> a - b;
		MathOperation mul = (a, b) -> a * b;
		
		System.out.println("Add      : " + add.operate(5, 3));
		System.out.println("Subtract : " + sub.operate(5, 3));
		System.out.println("Multiply : " + mul.operate(5, 3));

	}

}

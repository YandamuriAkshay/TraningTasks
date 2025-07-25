public class Task8b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		i++;
		System.out.println("pre-increment: " + i);
		
		int a = 5;
		++a;
		System.out.println("post-increment: " + a);
		
		//Bitwise shift operators
		
		int x = 10;
		
		System.out.println("Original value of x: " + x);
		System.out.println("right: " + (x << 2)); // Multiplies the number by 2 for each shift
		System.out.println("left: " + (x >> 2)); // it divides and retains the sign bit
		
		//Logical vs Bitwise & and &&
		
		//Logical AND &&
		
		int p = 5;
		int q = 10;
		if(p > 0 && q > 5) {
			System.out.println("Both lines true");
		} 
		
		if(p>0 & q>5) {
			System.out.println("Both lines true - no short circuit");
		}
		
		
		int result = p & q;
		System.out.println("Bitwise AND result: " + result);
	}

}

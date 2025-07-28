package task4;

public class RunnableCounter implements Runnable{
	public void run() {
		for(int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t = new Thread(new RunnableCounter());
		t.start();
	}

}

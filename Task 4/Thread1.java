package task4;

public class Thread1 extends Thread{
	
	public void run() {
		for(int i = 1; i <= 5; i++) {
			System.out.println("Thread1: " + i);
			try {
				Thread.sleep(1000);
			}catch (InterruptedException ex) {
				System.out.println("Thread Interrupted");
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread1 t1 = new Thread1();
		t1.start();
		
		try {
			t1.join();
		}catch (InterruptedException ex) {
			System.out.println("Main thread interrupted");
		}
		System.out.println("Main Thread Done....");

	}

}

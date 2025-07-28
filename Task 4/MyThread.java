package task4;

public class MyThread extends Thread{
	
	public void run() {
		System.out.println("Thread is Running....");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyThread t = new MyThread();
		System.out.println("Before Start: " + t.isAlive());
		t.start();
		System.out.println("After Start: " + t.isAlive());
		
		try {
			t.join();
		}catch (InterruptedException ex) {
			System.out.println("Join Interrupted");
		}
		System.out.println("After Join: " + t.isAlive());
	}

}

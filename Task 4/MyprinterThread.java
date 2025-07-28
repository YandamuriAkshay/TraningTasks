package task4;

public class MyprinterThread extends Thread{
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Hello From Thread!");
			try {
				Thread.sleep(1000);
			}catch(InterruptedException ex){
				System.out.println("Thread interrupted");
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyprinterThread t = new MyprinterThread();
		t.start();
	}

}

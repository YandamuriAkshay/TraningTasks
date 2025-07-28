package task4;

class MytaskThread extends Thread {
    public MytaskThread(String name) {
        super(name); // Set 
    }

    public void run() {
        System.out.println("Thread: " + Thread.currentThread().getName() +
                           " | Priority: " + Thread.currentThread().getPriority());

        for (int i = 1; i <= 3; i++) {
            System.out.println("Thread " + Thread.currentThread().getName() + " is running... step " + i);
        }
    }
}


public class PriorityDemo extends Thread{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 MytaskThread t1 = new MytaskThread("Low Priority Thread    ");
	     MytaskThread t2 = new MytaskThread("Normal Priority Thread ");
	     MytaskThread t3 = new MytaskThread("High Priority Thread   ");
	        
	     t1.setPriority(Thread.MIN_PRIORITY);   
	     t2.setPriority(Thread.NORM_PRIORITY);  
	     t3.setPriority(Thread.MAX_PRIORITY);   
	        
	     t1.start();
	     t2.start();
	     t3.start();
	}

}

package task4;

class Counter {
    int count = 0; 
}

class Myt4Thread extends Thread {
    Counter counter;

    public Myt4Thread(Counter counter) {
        this.counter = counter;
    }

    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.count++; 
        }
    }
}

public class RaceConditionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Counter sharedCounter = new Counter();

        Myt4Thread t1 = new Myt4Thread(sharedCounter);
        Myt4Thread t2 = new Myt4Thread(sharedCounter);

        t1.start();
        t2.start();

        try {
            t1.join(); 
            t2.join(); 
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }

        System.out.println("Final Counter Value: " + sharedCounter.count);
	}

}

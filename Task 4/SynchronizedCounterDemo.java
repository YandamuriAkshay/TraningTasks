package task4;

class Counter1 {
    int count = 0; 

    public void increment() {
        synchronized (this) {
            count++;
        }
    }
}

class Myt5Thread extends Thread {
    Counter1 counter1;  

    public Myt5Thread(Counter1 counter1) {
        this.counter1 = counter1;
    }

    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter1.increment();
        }
    }
}

public class SynchronizedCounterDemo {
    public static void main(String[] args) {
        Counter1 sharedCounter = new Counter1();

        Myt5Thread t1 = new Myt5Thread(sharedCounter);
        Myt5Thread t2 = new Myt5Thread(sharedCounter);

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

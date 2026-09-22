package co4;

class Counter {

    private int count = 0;

    // synchronized allows only one thread at a time
    public synchronized void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}

class CounterThread extends Thread {

    private Counter counter;

    CounterThread(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {

        // Increment counter 1000 times
        for (int i = 0; i < 1000; i++) {
            counter.increment();
        }
    }
}

public class SynchronizedDemo {

    public static void main(String[] args) {

        // Shared counter
        Counter counter = new Counter();

        // Two threads use the same counter
        CounterThread t1 = new CounterThread(counter);
        CounterThread t2 = new CounterThread(counter);

        // Start both threads
        t1.start();
        t2.start();

        try {
            // Wait for both threads to finish
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }

        // Expected result = 2000
        System.out.println("Final count: " + counter.getCount());
    }
}
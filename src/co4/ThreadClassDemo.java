package co4;

class MyThread extends Thread {

    // run() contains the task performed by the thread
    @Override
    public void run() {

        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread is running: " + i);

            try {
                Thread.sleep(500); // Pause for 500 milliseconds
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
        }
    }
}

public class ThreadClassDemo {

    public static void main(String[] args) {

        // Create thread object
        MyThread t1 = new MyThread();

        // Start the thread
        t1.start();

        System.out.println("Main thread is running");
    }
}
package co4;

class MyTask implements Runnable {

    @Override
    public void run() {

        for (int i = 1; i <= 5; i++) {
            System.out.println("Runnable thread: " + i);

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
        }
    }
}

public class RunnableDemo {

    public static void main(String[] args) {

        // Create Runnable object
        MyTask task = new MyTask();

        // Create Thread object and pass Runnable object
        Thread t1 = new Thread(task);

        // Start thread
        t1.start();

        System.out.println("Main thread is running");
    }
}

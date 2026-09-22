package co4;

class Message {

    private boolean available = false;

    // Producer method
    synchronized void produce() throws InterruptedException {

        // Wait if message is already available
        while (available) {
            wait();
        }

        System.out.println("Producer: Message produced");

        available = true;

        // Wake up waiting thread
        notify();
    }

    // Consumer method
    synchronized void consume() throws InterruptedException {

        // Wait until message becomes available
        while (!available) {
            wait();
        }

        System.out.println("Consumer: Message consumed");

        available = false;

        // Wake up waiting thread
        notify();
    }
}

public class WaitNotifyDemo {

    public static void main(String[] args) {

        Message message = new Message();

        // Producer thread
        Thread producer = new Thread(() -> {

            try {
                for (int i = 1; i <= 5; i++) {
                    message.produce();
                }
            } catch (InterruptedException e) {
                System.out.println("Producer interrupted");
            }
        });

        // Consumer thread
        Thread consumer = new Thread(() -> {

            try {
                for (int i = 1; i <= 5; i++) {
                    message.consume();
                }
            } catch (InterruptedException e) {
                System.out.println("Consumer interrupted");
            }
        });

        // Start both threads
        producer.start();
        consumer.start();
    }
}

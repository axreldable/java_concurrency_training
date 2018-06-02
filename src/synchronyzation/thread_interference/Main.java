package synchronyzation.thread_interference;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        concurrentIncrement(new NotThreadSafeCounter());
        concurrentIncrement(new SynchronizedCounter());
    }

    private static void concurrentIncrement(Counter counter) throws InterruptedException {
        Thread thread1 = new Thread(new Incrementer(counter));
        Thread thread2 = new Thread(new Incrementer(counter));

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println(counter.value());
        System.out.println("test");
    }
}

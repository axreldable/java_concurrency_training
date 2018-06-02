package thread_objects.interruption;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new ClassWithInterruptionMethod());
        thread1.start();
        Thread thread2 = new Thread(new ClassCheckInterruption());
        thread2.start();

        Thread.sleep(5000);

        thread1.interrupt();
        System.out.println(thread1.isInterrupted());
        thread2.interrupt();
        System.out.println(thread2.isInterrupted());

        System.out.println("!");
    }
}

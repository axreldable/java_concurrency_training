package thread_objects.interruption;

public class ClassWithInterruptionMethod implements Runnable {
    @Override
    public void run() {
        while (true) {
            System.out.println(this.getClass().getName());
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println(this.getClass().getName() + " was interrupted");
                return;
            }
        }
    }
}

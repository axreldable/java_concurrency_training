package thread_objects.interruption;

public class ClassCheckInterruption implements Runnable {
    @Override
    public void run() {
        System.out.println(this.getClass().getName());
        while (true) {
            if (Thread.interrupted()) {
                System.out.println(this.getClass().getName() + " was interrupted");
                return;
            }
        }
    }
}

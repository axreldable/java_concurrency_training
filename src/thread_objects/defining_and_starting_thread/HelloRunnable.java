package thread_objects.defining_and_starting_thread;

public class HelloRunnable implements Runnable {
    @Override
    @SuppressWarnings("InfiniteLoopStatement")
    public void run() {
        while (true) {
            System.out.println("Hello! I am " + this.getClass().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


}

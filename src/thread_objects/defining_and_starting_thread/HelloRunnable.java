package thread_objects.defining_and_starting_thread;

public class HelloRunnable implements Runnable {
    @Override
    @SuppressWarnings("InfiniteLoopStatement")
    public void run() {
        while (true) {
            Util.printHello(this.getClass(), 10);
        }
    }


}

package synchronyzation.thread_interference;

public class SynchronizedCounter implements Counter {
    private int c;

    @Override
    public synchronized void increment() {
        c++;
    }

    @Override
    public synchronized int value() {
        return c;
    }
}

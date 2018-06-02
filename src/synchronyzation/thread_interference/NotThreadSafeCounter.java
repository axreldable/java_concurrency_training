package synchronyzation.thread_interference;

class NotThreadSafeCounter implements Counter {
    private int c;

    @Override
    public void increment() {
        c++;
    }

    @Override
    public int value() {
        return c;
    }
}

package synchronyzation.thread_interference;

class Incrementer implements Runnable {
    private Counter counter;

    Incrementer(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            counter.increment();
        }
    }
}

package thread_objects.defining_and_starting_thread;

public class Main {
    public static void main(String[] args) {
        new Thread(new HelloRunnable()).start();
        new HelloThread().start();
    }
}

package thread_objects.defining_and_starting_thread;

class Util {
    static void printHello(Class clazz, long sleepTime) {
        System.out.println("Hello! I am " + clazz.getName());
        try {
            Thread.sleep(sleepTime);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

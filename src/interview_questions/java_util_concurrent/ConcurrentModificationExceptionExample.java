package interview_questions.java_util_concurrent;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ConcurrentModificationExceptionExample {
    private final static Long CONST = 1_000_000L;
    private static List<Long> list = new ArrayList<>();

    public static void main(String[] args) {
        initList();
        System.out.println("int done");

        Runnable reader = () -> {
            for (Long i : list) {
                if (i == 5) {
                    list.remove(i);
                }
            }
        }; // Забавно ConcurrentModificationException вообще не относится к многопоточности,
        // а забано то, что 5 элемент все равно удалилися, не сомтря на Exception.

        Runnable writer = () -> list.set(0, 25L);

        ExecutorService service = Executors.newFixedThreadPool(2);
        service.submit(reader);
        service.submit(writer);

        System.out.println("!");
        list.stream()
                .limit(10)
                .forEach(System.out::println);
    }

    private static void initList() {
        for (long i = 0; i < CONST; i++) list.add(i);
    }
}

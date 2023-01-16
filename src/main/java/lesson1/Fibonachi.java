package lesson1;

import java.util.concurrent.atomic.AtomicInteger;

public class Fibonachi {
    int fib(int index, AtomicInteger counter) {
        counter.incrementAndGet();
        if (index == 0) return 0;
        if (index == 1) {
            return 1;
        }if (index == 2) {
            return 1;
        }
        return fib(index - 1, counter) + fib(index - 2, counter);
    }
}

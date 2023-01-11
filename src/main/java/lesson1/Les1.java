package lesson1;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Les1 {

    public static void main(String[] args) {
        Div div = new Div();
        Simple simple = new Simple();
        Fibonachi fibonachi = new Fibonachi();

        List<Integer> availableDivider = div.findAvailableDivider(12);
        for (Integer integer: availableDivider) {
            System.out.println(integer);
        }

        System.out.println();

        List<Integer> simpleNumbers = simple.findSimpleNumbers(100);
        System.out.println(simpleNumbers.size());
        for (Integer simpInt: simpleNumbers) {
            System.out.println(simpInt);
        }

        System.out.println();
        AtomicInteger counter = new AtomicInteger(0);
        System.out.println("fib: " + fibonachi.fib(10, counter));
        System.out.println("count: " + counter);
    }
}

package hW1;

import java.util.concurrent.atomic.AtomicInteger;

public class Fibonachi {
    public static int lineFibonachi(int number) {
        int result = 0;
        if (number <= 2) {
            return 1;
        }
        int x = 1;
        int y = 1;
        for (int i = 2; i < number; i++) {
            result = x + y;
            x = y;
            y = result;
        }
        return result;
    }

    public static int recursionFibonachi(int index) {
        if (index == 0) return 0;
        if (index == 1) {
            return 1;
        }
        if (index == 2) {
            return 1;
        }
        return recursionFibonachi(index - 1) + recursionFibonachi(index - 2);
    }

    public static void main(String[] args) {
        long time = System.currentTimeMillis();
        System.out.println("LineFibonachi" + lineFibonachi(40));
        System.out.println("Time operation: " + (System.currentTimeMillis() - time));
        System.out.println();
        time = System.currentTimeMillis();
        System.out.println("RecursionFibonachi: " + recursionFibonachi(40));
        System.out.println("Time operation: " + (System.currentTimeMillis() - time));

    }
}

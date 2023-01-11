package lesson1;

import java.util.ArrayList;
import java.util.List;

public class Simple {
    List<Integer> findSimpleNumbers(int number) {
        List<Integer> result = new ArrayList<>();
        int counter = 0;
        for (int i = 1; i <= number; i++) {
            boolean simple = true;
            for (int j = 2; j < i; j++) {
                counter ++;
                if (i % j == 0) {
                    simple = false;
                    break;
                }
            }
            if (simple)
                result.add(i);
        }
        System.out.println(counter);
        System.out.println();
        return result;
    }
}

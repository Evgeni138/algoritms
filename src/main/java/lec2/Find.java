package lec2;

import java.util.Random;

public class Find {
    public static int binarSearch(int[] array, int value, int min, int max) {
        int midPoint;
        if (min > max) {
            return -1;
        } else {
            midPoint = (max - min) / 2 + min;
        }
        if (array[midPoint] < value) {
            return binarSearch(array, value, midPoint + 1, max);
        } else {
            if (array[midPoint] > value) {
                return binarSearch(array, value, min, midPoint - 1);
            } else return midPoint;
        }
    }

    public static int[] createArray(int count) {
        Random rnd = new Random();
        int[] array = new int[count];
        for (int i = 0; i < count; i++) {
            array[i] = rnd.nextInt(10);
            System.out.print(array[i] + " ");
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(binarSearch(array, 6, 0, 9));
    }
}

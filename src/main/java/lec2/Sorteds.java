package lec2;

import java.util.Random;

public class Sorteds {
    public static void bubbleSort(int[] array) {
        boolean finish;
        int count = 0;
        do {
            finish = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    count++;
                    finish = false;
                }
            }
        } while (!finish);
        System.out.println("count: " + count);
    }

    public static void directSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minPosition = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minPosition]) {
                    minPosition = j;
                }
            }
            if (i != minPosition) {
                int temp = array[i];
                array[i] = array[minPosition];
                array[minPosition] = temp;
            }
        }
    }

    public static void isertSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }

        }
    }

    public static void quickSort(int[] array, int startPosition, int endPosition) {
        int leftPosition = startPosition;
        int rightPosition = endPosition;
        int pivot = array[(startPosition + endPosition) / 2];

        do {
            while (array[leftPosition] < pivot) {
                leftPosition++;
            }
            while (array[rightPosition] > pivot) {
                rightPosition--;
            }
            if (leftPosition <= rightPosition) {
                if (leftPosition < rightPosition) {
                    int temp = array[leftPosition];
                    array[leftPosition] = array[rightPosition];
                    array[rightPosition] = temp;
                }
                leftPosition++;
                rightPosition--;
            }
        } while (leftPosition <= rightPosition);
        if (leftPosition < endPosition) {
            quickSort(array, leftPosition, endPosition);
        }
        if (startPosition < rightPosition) {
            quickSort(array, startPosition, rightPosition);
        }
    }

    public static void heapSort(int[] array) {
        for (int i = array.length / 2 -1; i >= 0; i--) {
            heapify(array, array.length, i);
        }

        for (int i = array.length - 1; i >= 0; i--) {
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            heapify(array, i, 0);
        }
    }

    public static void heapify(int[] array, int heapSize, int rootIndex){
        int largest = rootIndex;
        int leftChild = rootIndex * 2 + 1;
        int rightChild = rootIndex * 2 + 2;
        if (leftChild < heapSize && array[leftChild] > array[largest]){
            largest = leftChild;
        }
        if (rightChild < heapSize && array[rightChild] > array[largest]){
            largest = rightChild;
        }
        if (largest != rootIndex) {
            int temp = array[rootIndex];
            array[rootIndex] = array[largest];
            array[largest] = temp;

            heapify(array, heapSize, largest);
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
//        int[] array = new int[]{
//                3, 2, 5, 1, 4, 0, 7, 0, 9, 9
//        };
//
//        int[] array2 = new int[10];
//        System.out.println("DirectSort: ");
//        array2 = createArray(array2.length);
//        System.out.println();
//        directSort(array2);
//        for (int i = 0; i < array.length; i++) {
//            System.out.print(array2[i] + " ");
//        }
//        System.out.println();
//        System.out.println();
//
//        System.out.println("BubbleSort: ");
//        bubbleSort(array);
//        for (int i = 0; i < array.length; i++) {
//            System.out.print(array[i] + " ");
//        }
//
//        System.out.println();
//        System.out.println();
//
//        System.out.println("IsertSort: ");
//        int[] array3 = new int[10];
//        array3 = createArray(array3.length);
//        System.out.println();
//        isertSort(array3);
//        for (int i = 0; i < array.length; i++) {
//            System.out.print(array3[i] + " ");
//        }
//        System.out.println();
//        System.out.println();


//        int[] array4 = new int[]{8, 7, 9, 0, 5, 1, 3, 2, 9, 4, 7, 3, 1};
//        System.out.println("QuickSort: ");
//        quickSort(array4, 0, 12);
//        for (int i = 0; i < array4.length; i++) {
//            System.out.print(array4[i] + " ");
//        }

        System.out.println();
        System.out.println();

        int[] array5 = new int[]{8, 7, 9, 0, 5, 1, 3, 2, 9, 4, 7, 3, 1};
        System.out.println("HeapSort: ");
        heapSort(array5);
        for (int i = 0; i < array5.length; i++) {
            System.out.print(array5[i] + " ");
        }
    }
}

package vasylchenko.module5.mod5_2;

import java.util.Arrays;

public class ArraySort {

    public int[] simpleSort(int[] sortArray) {
        try {
            if (sortArray.length == 0) throw new NullPointerException();
            if (sortArray.length == 1) {
                System.out.println("Сортировка массива с 1 элементом дает результат " + sortArray[0] + ". Ожидалось что-то другое? :)");
            } else {
                System.out.println("Массив перед сортировкой имеет вид: " + Arrays.toString(sortArray));
                Arrays.sort(sortArray);
                System.out.println("Массив после сортировки имеет вид: " + Arrays.toString(sortArray));
            }
        } catch (NullPointerException e) {
            System.out.println("Массив пустой. Нечего сортировать.");
        }
        return sortArray;
    }

    public int[] bubbleSort(int[] sortArray) {
        try {
            if (sortArray.length == 0) throw new NullPointerException();
            if (sortArray.length == 1) {
                System.out.println("Сортировка массива с 1 элементом дает результат " + sortArray[0] + ". Ожидалось что-то другое? :)");
            } else {
                System.out.println("Массив перед сортировкой имеет вид: " + Arrays.toString(sortArray));
                for (int i = sortArray.length - 1; i > 0; i--) {
                    for (int j = 0; j < i; j++) {
                        if (sortArray[j] > sortArray[j + 1]) {
                            int tmp = sortArray[j];
                            sortArray[j] = sortArray[j + 1];
                            sortArray[j + 1] = tmp;
                        }
                    }
                }
                System.out.println("Массив после сортировки имеет вид: " + Arrays.toString(sortArray));
            }
        } catch (NullPointerException e) {
            System.out.println("Массив пустой. Нечего сортировать.");
        }
        return sortArray;
    }
}

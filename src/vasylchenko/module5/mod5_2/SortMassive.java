package vasylchenko.module5.mod5_2;

import java.util.Arrays;

/**
 * Created by v.vasilchenko on 15.03.2016.
 */
public class SortMassive {

    public void simpleSort(int[] sortMassive) {
        if (sortMassive.length == 0) {
            System.out.println("Массив пустой. Нечего сортировать.");
        } else if (sortMassive.length == 1) {
            System.out.println("Сортировка массива с 1 элементом дает результат " + sortMassive[0] + ". Ожидалось что-то другое? :)");
        } else {
            System.out.println("Массив перед сортировкой имеет вид: " + Arrays.toString(sortMassive));
            Arrays.sort(sortMassive);
            System.out.println("Массив после сортировки имеет вид: " + Arrays.toString(sortMassive));
        }
    }

    public void bubbleSort(int[] sortMassive) {
        if (sortMassive.length == 0) {
            System.out.println("Массив пустой. Нечего сортировать.");
        } else if (sortMassive.length == 1) {
            System.out.println("Сортировка массива с 1 элементом дает результат " + sortMassive[0] + ". Ожидалось что-то другое? :)");
        } else {
            System.out.println("Массив перед сортировкой имеет вид: " + Arrays.toString(sortMassive));
            for (int i = sortMassive.length - 1; i > 0; i--) {
                for (int j = 0; j < i; j++) {
                    if (sortMassive[j] > sortMassive[j + 1]) {
                        int tmp = sortMassive[j];
                        sortMassive[j] = sortMassive[j + 1];
                        sortMassive[j + 1] = tmp;
                    }
                }
            }
            System.out.println("Массив после сортировки имеет вид: " + Arrays.toString(sortMassive));
        }
    }
}

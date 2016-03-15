package vasylchenko.module5.mod5_2;

import java.util.Arrays;

/**
 * Created by v.vasilchenko on 15.03.2016.
 */
public class SortMassive {

    public void simpleSort(int[] sortMassive) {
        System.out.println("Массив перед сортировкой имеет вид: ");
        for (int i : sortMassive)
            System.out.println(i);
        Arrays.sort(sortMassive);
        System.out.println("Массив после сортировки имеет вид: ");
        for (int i : sortMassive)
            System.out.println(i);
    }

    public void bubbleSort(int[] sortMassive) {
        System.out.println("Массив перед сортировкой имеет вид: ");
        for (int i : sortMassive)
            System.out.println(i);
        for (int i = sortMassive.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (sortMassive[j] > sortMassive[j + 1]) {
                    int tmp = sortMassive[j];
                    sortMassive[j] = sortMassive[j + 1];
                    sortMassive[j + 1] = tmp;
                }
            }
        }
        System.out.println("Массив после сортировки имеет вид: ");
        for (int i : sortMassive)
            System.out.println(i);
    }
}

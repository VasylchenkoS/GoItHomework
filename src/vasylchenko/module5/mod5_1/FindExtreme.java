package vasylchenko.module5.mod5_1;

/**
 * Created by v.vasilchenko on 15.03.2016.
 */
public class FindExtreme {

    public void maxExtreme(int[] massive) {
        int maxIndex = 0;
        if (massive.length == 0) {
            System.out.println("Массив пустой. Нечего сортировать.");
        } else if (massive.length == 1) {
            System.out.println("Максимальное значение массива с 1 элементом - " + massive[0] + ". Ожидалось что-то другое? :)");
        } else {
            for (int aMassive : massive) {
                if (maxIndex < aMassive) {
                    maxIndex = aMassive;
                }
            }
            System.out.println("Максимальное занчение в массиве " + maxIndex);
        }
    }

    public void minExtreme(int[] massive) {
        if (massive.length == 0) {
            System.out.println("Массив пустой. Нечего сортировать.");
        } else if (massive.length == 1) {
            System.out.println("Минимальное значение массива с 1 элементом - " + massive[0] + ". Ожидалось что-то другое? :)");
        } else {
            int minIndex = massive[0];
            int i = 0;
            do {
                if (minIndex > massive[i])
                    minIndex = massive[i];
                i++;
            }
            while (i < massive.length);
            System.out.println("Минимальное занчение в массиве " + minIndex);
        }
    }
}


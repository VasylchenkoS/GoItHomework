package vasylchenko.module5.mod5_1;

/**
 * Created by v.vasilchenko on 15.03.2016.
 */
public class FindExtreme {

    public void maxExtreme(int[] array) {
        int maxIndex = 0;
        try {
            if (array.length == 0) throw new NullPointerException();
            if (array.length == 1) {
                System.out.println("Максимальное значение массива с 1 элементом - " + array[0] + ". Ожидалось что-то другое? :)");
            } else {
                for (int aArray : array) {
                    if (maxIndex < aArray) {
                        maxIndex = aArray;
                    }
                }
                System.out.println("Максимальное занчение в массиве " + maxIndex);
            }
        } catch (NullPointerException e) {
            System.out.println("Массив пустой.");
        }
    }

    public void minExtreme(int[] array) {
        try {
            if (array.length == 0) throw new NullPointerException();
            if (array.length == 1) {
                System.out.println("Минимальное значение массива с 1 элементом - " + array[0] + ". Ожидалось что-то другое? :)");
            } else {
                int minIndex = array[0];
                int i = 0;
                do {
                    if (minIndex > array[i])
                        minIndex = array[i];
                    i++;
                }
                while (i < array.length);
                System.out.println("Минимальное занчение в массиве " + minIndex);
            }
        } catch (NullPointerException e) {
            System.out.println("Массив пустой.");
        }
    }
}


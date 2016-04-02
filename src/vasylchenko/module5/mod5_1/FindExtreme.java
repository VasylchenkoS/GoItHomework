package vasylchenko.module5.mod5_1;

public class FindExtreme {

    public int maxExtreme(int[] array) {
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
        return maxIndex;
    }

    public int minExtreme(int[] array) {
        int minIndex = 0;
        try {
            if (array.length == 0) throw new NullPointerException();
            if (array.length == 1) {
                System.out.println("Минимальное значение массива с 1 элементом - " + array[0] + ". Ожидалось что-то другое? :)");
            } else {
                minIndex = array[0];
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
        return minIndex;
    }
}


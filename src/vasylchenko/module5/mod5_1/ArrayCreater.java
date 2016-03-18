package vasylchenko.module5.mod5_1;

import java.util.Arrays;

/**
 * Created by v.vasilchenko on 15.03.2016.
 */
public class ArrayCreater {

    public int[] arrayExtreme = new int[10];

    public int[] getArrayExtreme() {
        return arrayExtreme;
    }

    public void setArrayExtreme() {
        for (int i = 0; i < arrayExtreme.length; i++) {
            arrayExtreme[i] = (int) (Math.random() * 100) - 50;
        }
        System.out.println("Массив содержит следующие переменные: " + Arrays.toString(arrayExtreme));
    }
}

package vasylchenko.module5.mod5_1;

/**
 * Created by v.vasilchenko on 15.03.2016.
 */
public class FindExtreme {

    public void maxExtreme(int[] massive) {
        int maxIndex = 0;
        for (int aMassive : massive) {
            if (maxIndex < aMassive) {
                maxIndex = aMassive;
            }
        }
        System.out.println("Максимальное занчение в массиве " + maxIndex);
    }

    public void minExtreme(int[] massive) {
        int minIndex = massive[0];
        int i = 1;
        do {
            if (minIndex > massive[i])
                minIndex = massive[i];
            i++;
        }
        while (i < massive.length);
        System.out.println("Минимальное занчение в массиве " + minIndex);
    }
}


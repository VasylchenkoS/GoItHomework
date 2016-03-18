package vasylchenko.module5.mod5_2;

/**
 * Created by v.vasilchenko on 15.03.2016.
 */
public class ArrayCreater {

    private int[] arraySort = new int[25];

    public int[] getArraySort() {
        return arraySort;
    }

    public void setArraySort() {
        for (int i = 0; i < arraySort.length; i++) {
            arraySort[i] = (int) (Math.random() * 100) - 50;
        }
    }
}

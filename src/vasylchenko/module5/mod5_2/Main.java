package vasylchenko.module5.mod5_2;

/**
 * Created by v.vasilchenko on 15.03.2016.
 */
public class Main {
    public static void main(String[] args) {
        ArrayCreater arrayCreater = new ArrayCreater();
        arrayCreater.setArraySort();
        ArraySort arraySort = new ArraySort();
        arraySort.simpleSort(arrayCreater.getArraySort());
        arrayCreater.setArraySort();
        arraySort.bubbleSort(arrayCreater.getArraySort());
    }
}

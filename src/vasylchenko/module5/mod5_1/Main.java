package vasylchenko.module5.mod5_1;

/**
 * Created by v.vasilchenko on 15.03.2016.
 */
public class Main {
    public static void main(String[] args) {
        ArrayCreater arrayCreater = new ArrayCreater();
        arrayCreater.setArrayExtreme();
        FindExtreme findExtreme = new FindExtreme();
        findExtreme.maxExtreme(arrayCreater.getArrayExtreme());
        findExtreme.minExtreme(arrayCreater.getArrayExtreme());
    }
}

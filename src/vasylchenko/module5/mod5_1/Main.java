package vasylchenko.module5.mod5_1;

/**
 * Created by v.vasilchenko on 15.03.2016.
 */
public class Main {
    public static void main(String[] args) {
        MassiveCreater massive = new MassiveCreater();
        massive.setExtremeMassive();
        FindExtreme findExtreme = new FindExtreme();
        findExtreme.maxExtreme(massive.getExtremeMassive());
        findExtreme.minExtreme(massive.getExtremeMassive());
    }
}

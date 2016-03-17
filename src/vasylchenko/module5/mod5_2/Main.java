package vasylchenko.module5.mod5_2;

/**
 * Created by v.vasilchenko on 15.03.2016.
 */
public class Main {
    public static void main(String[] args) {
        MassiveCreater massiveCreater = new MassiveCreater();
        massiveCreater.setSortMassive();
        SortMassive sortMassive = new SortMassive();
        sortMassive.simpleSort(massiveCreater.getSortMassive());
        massiveCreater.setSortMassive();
        sortMassive.bubbleSort(massiveCreater.getSortMassive());
    }
}

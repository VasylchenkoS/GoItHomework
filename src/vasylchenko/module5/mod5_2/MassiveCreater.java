package vasylchenko.module5.mod5_2;

/**
 * Created by v.vasilchenko on 15.03.2016.
 */
public class MassiveCreater {

    private int[] sortMassive = new int[10];

    public int[] getSortMassive() {
        return sortMassive;
    }

    public void setSortMassive() {
        for (int i = 0; i < sortMassive.length; i++) {
            sortMassive[i] = (int) (Math.random() * 100);
        }
//        System.out.println("Массив содержит следующие переменные: ");
//        for (int i: sortMassive) {
//            System.out.println(i);
//      }
    }
}

package vasylchenko.module5.mod5_1;

/**
 * Created by v.vasilchenko on 15.03.2016.
 */
public class MassiveCreater {

    private int[] extremeMassive = new int[10];

    public int[] getExtremeMassive() {
        return extremeMassive;
    }

    public void setExtremeMassive() {
        for (int i = 0; i < extremeMassive.length; i++) {
            extremeMassive[i] = (int) (Math.random() * 100);
        }
        for (int i : extremeMassive) {
            System.out.println("Массив содержит следующие переменные: " + i);
        }
    }
}

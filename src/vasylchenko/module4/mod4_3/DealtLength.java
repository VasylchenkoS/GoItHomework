package vasylchenko.module4.mod4_3;

import java.util.Scanner;

/**
 * Created by v.vasilchenko on 10.03.2016.
 */
public class DealtLength {

    public static void main(String[] args){
        DealtLength dekart = new DealtLength();
        dekart.getData();
    }

    public void getData() {
        int dot1[] = new int[2];
        int dot2[] = new int[2];
        System.out.println("Введите через пробел координаты первой точки");
        Scanner scan1 = new Scanner(System.in);
        dot1[0] = scan1.nextInt();
        dot1[1] = scan1.nextInt();
        System.out.println("Введите через пробел координаты второй точки");
        Scanner scan2 = new Scanner(System.in);
        dot2[0] = scan2.nextInt();
        dot2[1] = scan2.nextInt();
        dotLength(dot1, dot2);
    }

    public void dotLength(int dot1[], int dot2[]) {
        double dotLength = Math.sqrt(Math.pow(dot2[0] - dot1[0], 2) + Math.pow(dot2[1] - dot1[1], 2));
        System.out.println("Длинна отрезка равна " + dotLength);
    }
}

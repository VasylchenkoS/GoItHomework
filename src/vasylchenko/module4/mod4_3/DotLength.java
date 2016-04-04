package vasylchenko.module4.mod4_3;

import java.util.Scanner;

public class DotLength {

    public void getData() {
        int dot1[] = new int[2];
        int dot2[] = new int[2];
        try {
            System.out.println("Введите через пробел координаты первой точки");
            Scanner scan1 = new Scanner(System.in);
            dot1[0] = scan1.nextInt();
            dot1[1] = scan1.nextInt();
            System.out.println("Введите через пробел координаты второй точки");
            Scanner scan2 = new Scanner(System.in);
            dot2[0] = scan2.nextInt();
            dot2[1] = scan2.nextInt();
        } catch (IllegalStateException e) {
            System.out.println("[Error]: Введенное значение имеет неверный формат. Ввдеите значение, тип которых int");
        }
        dotLength(dot1[0], dot1[1], dot2[0], dot2[1]);
    }


    public double dotLength(int dotX1, int dotY1, int dotX2, int dotY2) {
        double dotLength = Math.sqrt(Math.pow(dotX2 - dotX1, 2) + Math.pow(dotY2 - dotY1, 2));
        System.out.println("Длинна отрезка равна " + dotLength);
        return dotLength;
    }
}

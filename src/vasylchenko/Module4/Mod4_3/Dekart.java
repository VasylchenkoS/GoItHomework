package vasylchenko.Module4.Mod4_3;

import java.util.Scanner;

/**
 * Created by v.vasilchenko on 10.03.2016.
 */
public class Dekart {
    Dekart(int x1, int y1, int x2, int y2)
    {
        double lenght = Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
        System.out.println("Длинна отрезка равна " + lenght);
    }
    public static void main(String[] args){
        int x1,x2,y1,y2;
        System.out.println("Введите координаты первой точки");
        Scanner scan1 = new Scanner(System.in);
        x1 = scan1.nextInt();
        y1 = scan1.nextInt();
        System.out.println("Введите координаты второй точки");
        Scanner scan2 = new Scanner(System.in);
        x2 = scan1.nextInt();
        y2 = scan1.nextInt();
        Dekart dekart = new Dekart(x1,y1,x2,y2);
    }
}

package vasylchenko.module4.mod4_1;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by v.vasilchenko on 09.03.2016.
 */
public class Figure {
    public void figureArea()
    {
        System.out.println("Введено мало аргументов");
    }
    public void figureArea(double radius){
        double area = Math.PI*radius*radius;
        //Площадь круга вычисляется по формуле: S = Pi*Radius^2
        System.out.println("Площадь круга равна " + area);
    }
    public void figureArea(double sideA, double sideB){
        double area = sideA*sideB;
        //Площадь прямоугольника вычисляется по формуле: S = sideA * sideB
        System.out.println("Площадь прямоугольника равна " + area);
    }
    public void figureArea(double sideA, double sideB, double sideC){
        //проверим существование треугольника:
        if ((sideA<sideB+sideC)&&(sideB<sideA+sideC)&&(sideC<sideA+sideB)){
            double p = (sideA+sideB+sideC)/2;
            //Площадь треугольника вычисляется по формуле Герона:
            double area = p*(p-sideA)*(p-sideB)*(p-sideC);
            System.out.println("Площадь треугольника равна " + Math.sqrt(area));
        }
        else
        {
            System.out.println("Треугольник не существует");
        }
    }
    public static void main(String[] args) throws IOException {
       double a,b,c;
        System.out.print("Введите данные: ");
        Scanner sc1 = new Scanner(System.in);
        a = sc1.nextDouble();
        Scanner sc2 = new Scanner(System.in);
        b = sc2.nextDouble();
        Scanner sc3 = new Scanner(System.in);
        c = sc3.nextDouble();
        Figure fig = new Figure();
        if ((a!=0)&&(b==0)&&(c==0))
            fig.figureArea(a);
        else if ((a!=0)&&(b!=0)&&(c==0))
            fig.figureArea(a,b);
        else if((a!=0)&&(b!=0)&&(c!=0))
            fig.figureArea(a,b,c);
        /*fig.figureArea(1.1);
        fig.figureArea(1.1,1.1);
        fig.figureArea(1.1,1.1,1.1);*/
    }
}
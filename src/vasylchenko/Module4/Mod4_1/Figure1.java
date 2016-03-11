package vasylchenko.module4.mod4_1;

/**
 * Created by v.vasilchenko on 09.03.2016.
 */
public class Figure1 {

        Figure1(){
            System.out.println("Введено мало аргументов");
        }
        Figure1(double radius){
            //Площадь круга вычисляется по формуле: S = Pi*Radius^2
            double area = Math.PI*radius*radius;
            System.out.println("Площадь круга равна " + area);
        }
        Figure1(double sideA, double sideB){
            //Площадь прямоугольника вычисляется по формуле: S = sideA * sideB
            double area = sideA*sideB;
            System.out.println("Площадь прямоугольника равна " + area);
        }
        Figure1(double sideA, double sideB, double sideC){
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
    public static void main (String[] args)
    {
        Figure1 fig1 = new Figure1(1.1);
        Figure1 fig2 = new Figure1(1.1,1.1);
        Figure1 fig3 = new Figure1(1.1,1.1,1.1);
    }
}

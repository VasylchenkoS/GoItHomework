package vasylchenko.module4.mod4_1;

/**
 * Created by v.vasilchenko on 09.03.2016.
 */
public class NewFigureArea {

        NewFigureArea(){
            System.out.println("Введено мало аргументов");
        }
        NewFigureArea(double radius){
            //Площадь круга вычисляется по формуле: S = Pi*Radius^2
            double area = Math.PI*radius*radius;
            System.out.println("Площадь круга равна " + area);
        }
        NewFigureArea(double sideA, double sideB){
            //Площадь прямоугольника вычисляется по формуле: S = sideA * sideB
            double area = sideA*sideB;
            System.out.println("Площадь прямоугольника равна " + area);
        }
        NewFigureArea(double sideA, double sideB, double sideC){
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
        NewFigureArea fig1 = new NewFigureArea(1.1);
        NewFigureArea fig2 = new NewFigureArea(1.1,1.1);
        NewFigureArea fig3 = new NewFigureArea(1.1,1.1,1.1);
    }
}

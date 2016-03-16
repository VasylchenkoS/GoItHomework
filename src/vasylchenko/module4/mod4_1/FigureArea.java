package vasylchenko.module4.mod4_1;

/**
 * Created by v.vasilchenko on 09.03.2016.
 */
public class FigureArea {

    private void figureArea()
    {
        System.out.println("Введено мало аргументов");
    }

    private void circleArea(double radius) {
        if (radius <= 0) {
            System.out.println("Круга с радиусом " + radius + " не существует");
        } else {
            double area = Math.PI * radius * radius;
            //Площадь круга вычисляется по формуле: S = Pi*Radius^2
            System.out.println("Площадь круга равна " + area);
        }
    }

    private void rectangleArea(double sideA, double sideB) {
        if (sideA <= 0 || sideB <= 0) {
            System.out.println("Прямоугольника со сторонами " + sideA + " " + sideB + " не существует");
        } else {
            double area = sideA * sideB;
            //Площадь прямоугольника вычисляется по формуле: S = sideA * sideB
            System.out.println("Площадь прямоугольника равна " + area);
        }
    }

    private void triangleArea(double sideA, double sideB, double sideC) {
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
}
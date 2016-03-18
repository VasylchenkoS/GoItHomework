package vasylchenko.module4.mod4_1;

/**
 * Created by v.vasilchenko on 09.03.2016.
 */
public class FigureArea {

    public void figureArea() {
        System.out.println("Введено мало аргументов");
    }

    public void circleArea(double radius) {
        try {
            if (radius <= 0) throw new ArithmeticException();
            double area = Math.PI * radius * radius;
            //Площадь круга вычисляется по формуле: S = Pi*Radius^2
            System.out.println("Площадь круга равна " + area);
        } catch (ArithmeticException e) {
            System.out.println("[Error]: Круга с радиусом " + radius + " не существует");
        }

    }

    public void rectangleArea(double sideA, double sideB) {
        if (sideA <= 0 || sideB <= 0) throw new ArithmeticException();
        try {
            double area = sideA * sideB;
            //Площадь прямоугольника вычисляется по формуле: S = sideA * sideB
            System.out.println("Площадь прямоугольника равна " + area);
        } catch (ArithmeticException e) {
            System.out.println("[Error]: Прямоугольника со сторонами " + sideA + " " + sideB + " не существует");
        }
    }

    public void triangleArea(double sideA, double sideB, double sideC) {
        try {
            //проверим существование треугольника:
            if ((sideA < sideB + sideC) && (sideB < sideA + sideC) && (sideC < sideA + sideB)) {
                double p = (sideA + sideB + sideC) / 2;
                //Площадь треугольника вычисляется по формуле Герона:
                double area = p * (p - sideA) * (p - sideB) * (p - sideC);
                System.out.println("Площадь треугольника равна " + Math.sqrt(area));
            } else throw new ArithmeticException();
        } catch (ArithmeticException e) {
            System.out.println("[Error]: Треугольник не существует");
        }
    }
}
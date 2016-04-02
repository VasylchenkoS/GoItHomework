package vasylchenko.module4.mod4_1;

public class FigureArea {

    public void figureArea() {
        System.out.println("Введено мало аргументов");
    }

    public double circleArea(double radius) {
        double area = 0;
        try {
            if (radius <= 0) throw new ArithmeticException();
            area = Math.PI * radius * radius;
            //Площадь круга вычисляется по формуле: S = Pi*Radius^2
            System.out.println("Площадь круга равна " + area);
        } catch (ArithmeticException e) {
            System.out.println("[Error]: Круга с радиусом " + radius + " не существует");
        }
        return area;
    }

    public double rectangleArea(double sideA, double sideB) {
        double area = 0;
        if (sideA <= 0 || sideB <= 0) throw new ArithmeticException();
        try {
            area = sideA * sideB;
            //Площадь прямоугольника вычисляется по формуле: S = sideA * sideB
            System.out.println("Площадь прямоугольника равна " + area);
        } catch (ArithmeticException e) {
            System.out.println("[Error]: Прямоугольника со сторонами " + sideA + " " + sideB + " не существует");
        }
        return area;
    }

    public double triangleArea(double sideA, double sideB, double sideC) {
        double area = 0;
        try {
            //проверим существование треугольника:
            if ((sideA < sideB + sideC) && (sideB < sideA + sideC) && (sideC < sideA + sideB)) {
                double p = (sideA + sideB + sideC) / 2;
                //Площадь треугольника вычисляется по формуле Герона:
                area = Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
                System.out.println("Площадь треугольника равна " + area);
            } else throw new ArithmeticException();
        } catch (ArithmeticException e) {
            System.out.println("[Error]: Треугольник не существует");
        }
        return area;
    }
}
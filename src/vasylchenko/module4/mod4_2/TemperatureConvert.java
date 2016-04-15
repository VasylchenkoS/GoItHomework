package vasylchenko.module4.mod4_2;


import java.util.Scanner;

public class TemperatureConvert {

    private void getData() {
        double tempIn;
        int varIn;
        try {
            TemperatureConvert temperatureConvert = new TemperatureConvert();
            System.out.println("Введите значения температуры");
            Scanner scan = new Scanner(System.in);
            tempIn = scan.nextDouble();
            System.out.println("Значение в градусах Цельсия? (д-1/н-2)");
            Scanner scan2 = new Scanner(System.in);
            varIn = scan2.nextInt();
            if (varIn == 1) {
                temperatureConvert.toFahrenheit(tempIn);
            } else if (varIn == 2) {
                temperatureConvert.toCelsius(tempIn);
            } else System.out.println("Что-то пошло не так");
        } catch (IllegalStateException e) {
            System.out.println("[Error]: Введенное значение имеет неверный формат. Ввдеите значение, тип которых int");
        }
    }

    public double toCelsius(double temp) {
        double CONST_FOR_CELSIUS_CONVERT = 0.555555;
        double sumTemp = CONST_FOR_CELSIUS_CONVERT * (temp - 32);
        System.out.println("Температура " + temp + " по Фаренгейту равна " + sumTemp + " по Цельсию");
        return sumTemp;
    }

    public double toFahrenheit(double temp) {
        double sumTemp = temp * 1.8 + 32;
        System.out.println("Температура " + temp + " по Цельсию равна " + sumTemp + " по Фаренгейту");
        return sumTemp;
    }
}

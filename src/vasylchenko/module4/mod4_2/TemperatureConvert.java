package vasylchenko.module4.mod4_2;


import java.util.Scanner;

/**
 * Created by v.vasilchenko on 10.03.2016.
 */
public class TemperatureConvert {

    public static void main(String[] args) {
        TemperatureConvert temperatureConvert = new TemperatureConvert();
        temperatureConvert.getData();
    }

    public void getData() {
        double tempIn;
        int varIn;
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
    }

    private double toCelsius(double temp) {
        double sumTemp = 0.5555556 * (temp - 32);
        System.out.println("Температура " + temp + " по Фаренгейту равна " + sumTemp + " по Цельсию");
        return sumTemp;
    }

    private double toFahrenheit(double temp) {
        double sumTemp = temp * 1.8 + 32;
        System.out.println("Температура " + temp + " по Цельсию равна " + sumTemp + " по Фаренгейту");
        return sumTemp;
    }
}

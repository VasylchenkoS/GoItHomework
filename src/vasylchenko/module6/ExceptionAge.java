package vasylchenko.module6;

import java.util.Scanner;



public class ExceptionAge {
    public static void main(String[] args) {
        System.out.println("enter age");
        final Scanner scanner = new Scanner(System.in);
        final String userInput = scanner.next();
        try {
            final int age = Integer.parseInt(userInput);
            if (age<0) {
                throw new ExceptionRage(age);
            }
            System.out.println("your age is " + age);
        } catch (NumberFormatException ex){
            System.out.println("Error: Enter number " + ex.getMessage());
        }catch (ExceptionRage e){
            System.out.println("age <=0 " + e.getAgeValue());
        }
    }
}

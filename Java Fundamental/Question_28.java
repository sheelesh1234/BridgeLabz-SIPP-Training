// Write a TemperaturConversion program, given the temperature in Fahrenheit as input outputs thetemperature in Celsius

import java.util.Scanner;

public class Question_28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = sc.nextDouble();
        double celsiusResult = (fahrenheit - 32) * 5 / 9;
        System.out.println("The " + fahrenheit + " Fahrenheit is " + celsiusResult + " Celsius");
        sc.close();
    }
}

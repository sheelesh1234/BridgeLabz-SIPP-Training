// Write a TemperaturConversion program, given the temperature in Celsius as input outputs thetemperature in Fahrenheit

import java.util.Scanner;

public class Question_20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the temperature in Celsius");
        double celsius = sc.nextDouble();
        double fahrenheitResult = (celsius * 9 / 5) + 32;
        System.out.println("The " + celsius + " celsius is " + fahrenheitResult + " fahrenheit");
        sc.close();
    }
}

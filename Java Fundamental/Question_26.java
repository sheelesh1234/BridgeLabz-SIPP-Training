// Create a program to convert weight from pounds to kilograms.

import java.util.Scanner;

public class Question_26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the weight in pounds: ");
        double weightInPounds = sc.nextDouble();
        double weightInKg = weightInPounds / 2.2;
        System.out.println("The weight of the person in pounds is " + weightInPounds + " and in kg is " + weightInKg);
        sc.close();
    }
}

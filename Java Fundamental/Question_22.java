// Write a program to input the Principal, Rate, and Time values and calculate Simple Interest.

import java.util.Scanner;

public class Question_22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Principal value: ");
        double principal = sc.nextDouble();
        System.out.println("Enter the Rate value: ");
        double rate = sc.nextDouble();
        System.out.println("Enter the Time value: ");
        double time = sc.nextDouble();
        double simpleInterest = (principal * rate * time) / 100;
        System.out.println("The Simple Interest is " + simpleInterest + " for Principal " + principal
                + ", Rate of Interest " + rate + " and Time " + time);
        sc.close();
    }
}

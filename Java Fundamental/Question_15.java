// Write a program that takes the base and height in cm to find the area of a triangle in square inchesand square centimeters

import java.util.Scanner;

public class Question_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base in cm: ");
        double base = sc.nextDouble();
        System.out.println("Enter the height in cm: ");
        double height = sc.nextDouble();
        double areaInSqIn = (base * height) / 2 / 2.54 / 2.54;
        double areaInSqCm = (base * height) / 2;
        System.out.println("The Area of the triangle in sq in is " + areaInSqIn + " and sq cm is " + areaInSqCm);
        sc.close();
    }
}
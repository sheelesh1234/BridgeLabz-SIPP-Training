// Write a program to take two numbers and print their quotient and reminder

import java.util.Scanner;

public class Question_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int number1 = sc.nextInt();
        System.out.println("Enter the second number");
        int number2 = sc.nextInt();
        int quotient = number1 / number2;
        int remainder = number1 % number2;
        System.out.println(
                "The Quotient is " + quotient + " and Remainder is " + remainder + " of two number " + number1 + " and "
                        + number2);
        sc.close();
    }
}

// Create a Program that takes user input for Student Fee and University Discount to compute thediscounted amount and discounted price the student will pay for the course.

import java.util.Scanner;

public class Question_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int studFee = sc.nextInt();
        int univDisc = sc.nextInt();
        int discPrice = studFee - (studFee * univDisc / 100);
        int discAmount = studFee - discPrice;
        System.out.println("The discount amoount is INR " + discAmount + " and final discount fee is INR " + discPrice);
        sc.close();
    }
}

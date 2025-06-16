// An athlete runs in a triangular park with sides provided as input by the user in meters. If the athletewants to complete a 5 km run, then how many rounds must the athlete complete

import java.util.Scanner;

public class Question_21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first side of the triangle: ");
        int side1 = sc.nextInt();
        System.out.println("Enter the second side of the triangle: ");
        int side2 = sc.nextInt();
        System.out.println("Enter the third side of the triangle: ");
        int side3 = sc.nextInt();
        int perimeter = side1 + side2 + side3;
        int totalRounds = (int) (5000 / perimeter);
        System.out.println("The total number of rounds the athlete will run is " + totalRounds + " to complete 5 km");
        sc.close();
    }
}

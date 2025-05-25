package Assignment2;

import java.util.Scanner;

public class SimpleCompoundCalculator {
    public static double calculateSimpleInterest(double P, double R, double T) {
        return (P * R * T) / 100;
    }
    public static double calculateCompoundInterest(double P, double R, double T) {
        return P * Math.pow((1 + R / 100), T) - P;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        if (choice != 1 && choice != 2) {
            System.out.println("Invalid choice. Please enter 1 or 2.");
            return;
        }

        System.out.print("Enter Principal (P): ");
        double P = scanner.nextDouble();
        System.out.print("Enter Rate of Interest (R): ");
        double R = scanner.nextDouble();
        System.out.print("Enter Time in years (T): ");
        double T = scanner.nextDouble();

        double interest;
        if (choice == 1) {
            interest = calculateSimpleInterest(P, R, T);
            System.out.printf("Simple Interest = %.2f\n", interest);
        } else {
            interest = calculateCompoundInterest(P, R, T);
            System.out.printf("Compound Interest = %.2f\n", interest);
        }
    }
}

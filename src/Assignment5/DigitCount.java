package Assignment5;

import java.util.Scanner;

public class DigitCount {
    public static int countDigits(int n) {
        if (n == 0) return 0;
        return 1 + countDigits(n / 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num == 0) {
            System.out.println("The number of digits in 0 is 1");
        } else {
            System.out.println("The number of digits in " + num + " is " + countDigits(num));
        }
    }
}

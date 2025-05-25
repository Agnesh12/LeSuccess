package Assignment1;

import java.util.Scanner;

public class Bitwiseoperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int andResult = num1 & num2;
        int orResult = num1 | num2;
        int xorResult = num1 ^ num2;

        int leftShiftNum1 = num1 << 2;
        int leftShiftNum2 = num2 << 2;
        int rightShiftNum1 = num1 >> 2;
        int rightShiftNum2 = num2 >> 2;

        System.out.println("Bitwise AND: " + andResult);
        System.out.println("Bitwise OR: " + orResult);
        System.out.println("Bitwise XOR: " + xorResult);
        System.out.println("Left Shift (num1 << 2): " + leftShiftNum1);
        System.out.println("Left Shift (num2 << 2): " + leftShiftNum2);
        System.out.println("Right Shift (num1 >> 2): " + rightShiftNum1);
        System.out.println("Right Shift (num2 >> 2): " + rightShiftNum2);
    }
}

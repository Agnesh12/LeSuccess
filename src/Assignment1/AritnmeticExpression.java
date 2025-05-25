package Assignment1;

import java.util.Scanner;

public class AritnmeticExpression {
    public static void main(String[] args) {
        Scanner dumpy = new Scanner(System.in);
        int Number1 = dumpy.nextInt();
        int Number2 = dumpy.nextInt();
        double DNumber =  dumpy.nextDouble();
        System.out.println(Number1 + Number2);
        System.out.println(Number1 - Number2);
        System.out.println(Number1 * Number2);
        System.out.println(Number1 / Number2);
        System.out.println((Number1 + Number2) * DNumber);

    }
}

package Assignment1;

import java.util.Scanner;

public class TypeConversion {
    public static void main(String[] args) {
        Scanner dump = new Scanner(System.in);

        int a = dump.nextInt();
        float b = dump.nextFloat();
        char c = dump.next().charAt(0);

        float ConvA = (float) a + b;
        int ConvC = (int) c;
        int result = a + ConvC;

        System.out.println(ConvA);
        System.out.println(result);
    }
}

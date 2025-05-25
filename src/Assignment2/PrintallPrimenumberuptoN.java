package Assignment2;

import java.util.Scanner;

public class PrintallPrimenumberuptoN {
    public static void main(String[] args) {
        Scanner dummy = new Scanner(System.in);
        int Number = dummy.nextInt();
        for(int i = 1; i <= Number; i++) {
            int Count = 0;
            for(int j = 1; j <= Number; j++) {
                if(i % j == 0) {
                    Count++;
                }
            }
            if(Count == 2) {
                System.out.print(i + " ");
            }
        }
    }
}

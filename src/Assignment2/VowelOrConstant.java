package Assignment2;

import java.util.Scanner;

public class VowelOrConstant {
    public static void main(String[] args) {
        Scanner dummy = new Scanner(System.in);
        char Check = dummy.next().charAt(0);
        if(Check == 'a' || Check == 'e' || Check == 'i' || Check == '0' || Check == 'u') {
            System.out.println("Character is Vowel");
        }
        else {
            System.out.println("Character is Consonant");
        }
    }
}

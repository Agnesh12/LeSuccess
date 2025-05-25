package Assignment2;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner dummy = new Scanner(System.in);
        int Mark = dummy.nextInt();
        if(Mark >= 90) {
            System.out.println("Grade A");
        }
        else if(Mark <= 89 && Mark >= 75) {
            System.out.println("Grade B");
        }
        else if(Mark >= 60 &&  Mark <= 74) {
            System.out.println("Grade C");
        }
        else if(Mark >= 40 && Mark <= 59) {
            System.out.println("Grade D");
        }
        else {
            System.out.println("Grade E");
        }
    }
}

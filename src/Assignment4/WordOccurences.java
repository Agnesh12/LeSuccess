package Assignment4;

import java.util.Scanner;

public class WordOccurences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        String target = sc.nextLine();

        String[] words = sentence.split("\\s+");
        int count = 0;

        for (String word : words) {
            if (word.equals(target)) {
                count++;
            }
        }

        System.out.println(count);
    }
}

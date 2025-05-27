package Assignment4;

import java.util.HashSet;

public class RemoveDuplicates {
    public static String RemDuplicates(String Str) {
        HashSet<Character> charset = new HashSet();
        for(char Ch : Str.toCharArray()) {
            charset.add(Ch);
        }
        String Result = "";
        for(char Ch : charset) {
            Result += Ch;
        }
        return Result;
    }
    public static void main(String[] args) {
        String Str = "Programming";
        System.out.print(RemDuplicates(Str));
    }
}

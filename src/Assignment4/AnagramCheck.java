package Assignment4;

import java.util.HashMap;

public class AnagramCheck {
    public static boolean CheckAnagram(String Str1, String Str2) {
        HashMap<Character, Integer> Str1Values = new HashMap();
        HashMap<Character, Integer> Str2Values = new HashMap<>();
        for(char Ch : Str1.toCharArray()) {
            Str1Values.put(Ch, Str1Values.getOrDefault(Ch, 0) + 1);
        }
        for(char Ch : Str2.toCharArray()) {
            Str2Values.put(Ch, Str2Values.getOrDefault(Ch, 0) + 1);
        }
        return Str1Values.equals(Str2Values);
    }
    public static void main(String[] args) {
        String Str1 = "abc";
        String Str2 = "bac";
        if(CheckAnagram(Str1, Str2)) {
            System.out.println("Anagram");
        }
        else {
            System.out.println("Not Anagram");
        }
    }
}

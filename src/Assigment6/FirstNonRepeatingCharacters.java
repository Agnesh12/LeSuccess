package Assigment6;

import java.util.HashMap;

public class FirstNonRepeatingCharacters {
    public static int FindUnique(String Str) {
        HashMap<Character, Integer> Check = new HashMap<>();
        for(char Ch : Str.toCharArray()) {
            Check.put(Ch, Check.getOrDefault(Ch, 0) + 1);
        }
        for(int i = 0; i < Str.length(); i++) {
            char Ch = Str.charAt(i);
            if(Check.get(Ch) == 1) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String Str = "mountaian";
        System.out.print(FindUnique(Str));
    }
}

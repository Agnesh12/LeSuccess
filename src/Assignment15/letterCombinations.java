package Assignment15;

import java.util.*;

public class letterCombinations {
    public List<String> LetterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits == null || digits.length() == 0) return result;

        Map<Character, String> phoneMap = Map.of(
                '2', "abc",
                '3', "def",
                '4', "ghi",
                '5', "jkl",
                '6', "mno",
                '7', "pqrs",
                '8', "tuv",
                '9', "wxyz"
        );

        backtrack(result, digits, phoneMap, 0, new StringBuilder());
        return result;
    }

    private void backtrack(List<String> result, String digits, Map<Character, String> phoneMap, int index, StringBuilder current) {
        if (index == digits.length()) {
            result.add(current.toString());
            return;
        }

        String letters = phoneMap.get(digits.charAt(index));
        for (char c : letters.toCharArray()) {
            current.append(c);
            backtrack(result, digits, phoneMap, index + 1, current);
            current.deleteCharAt(current.length() - 1); // backtrack
        }
    }
}


package Assignment3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DuplicateElements {
    public static List<Integer> Duplicates(int[] arr) {
        List<Integer> Result = new ArrayList<>();
        HashMap<Integer, Integer> Check = new HashMap();
        for(int num : arr) {
            if(Check.containsKey(num)) {
                Result.add(num);
            }
            else {
                Check.put(num, 1);
            }
        }
        return Result;
    }
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 4, 5};
        System.out.print(Duplicates(arr));
    }
}

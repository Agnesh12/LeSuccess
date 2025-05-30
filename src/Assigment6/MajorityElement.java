package Assigment6;

import java.util.HashMap;

public class MajorityElement {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 1, 2, 2, 2, 3, 3};
       HashMap<Integer, Integer> frequency = new HashMap<>();
       for(int num : arr) {
           frequency.put(num, frequency.getOrDefault(num, 0) + 1);
       }
       int MaxFrequency = 0;
       int Majority = Integer.MIN_VALUE;
       for(int Key : frequency.keySet()) {
           if(frequency.get(Key) > MaxFrequency) {
               MaxFrequency = frequency.get(Key);
               Majority = Key;

           }

       }
        System.out.println(Majority);
    }
}

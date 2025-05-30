package Assigment6;

public class MaxSubarray {
    public static void main(String[] args) {
        int[] arr = {4, 5, -3, -2, 7, 8, 9};
        int MaxSum = Integer.MIN_VALUE;
        int Sum = 0;
        for(int num : arr) {
            Sum += num;
            if(Sum > MaxSum) {
                MaxSum = Sum;
            }
            if(Sum < 0) {
                Sum = 0;
            }
        }
        System.out.println(MaxSum);

    }
}

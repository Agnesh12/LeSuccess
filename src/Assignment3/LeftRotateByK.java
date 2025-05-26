package Assignment3;

import java.util.Arrays;

public class LeftRotateByK {
    public static void Reverse(int[] arr, int Start, int End) {
        while(Start < End) {
            int Temp = arr[Start];
            arr[Start] = arr[End];
            arr[End] = Temp;
            Start++;
            End--;
        }
    }
    public static void Rotate(int[] arr, int K) {
        if(K == 0) {
            return;
        }
        int Rot = K % arr.length;
        Reverse(arr, 0, Rot - 1);
        Reverse(arr, Rot, arr.length - 1);
        Reverse(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int K = 2;
        Rotate(arr, K);
    }
}

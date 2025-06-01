package Assignment9;
import java.util.Arrays;
public class MoveZerostoEnd {
    public static void main(String[] args) {
        int[] arr = {1, 0, 0, 3, 4, 5};
        int Index =0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] != 0) {
                int temp = arr[Index];
                arr[Index] = arr[i];
                arr[i] = temp;
                Index++;
            }
        }
        for(int i = Index; i < arr.length; i++) {
            arr[i] = 0;
        }
        System.out.println(Arrays.toString(arr));
    }
}

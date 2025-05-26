package Assignment3;

public class SearchElement {
    public static int SearchIndex(int[] arr, int Target) {
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == Target) {
                return i;
            }

        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 6, 7};
        int target = 7;
        System.out.print(SearchIndex(arr, target));
    }
}

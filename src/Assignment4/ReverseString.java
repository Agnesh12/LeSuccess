package Assignment4;

public class ReverseString {
    public static void main(String[] args) {
        String Str = "Programming";
        StringBuilder reverse = new StringBuilder(Str);
        reverse.reverse();
        System.out.println(reverse.toString());
    }
}

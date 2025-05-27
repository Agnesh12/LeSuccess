package Assignment4;

public class ToggleCase {
    public static String Toggle(String Str) {
        int Left = 0;
        String Result = "";
        int Right = Str.length() - 1;
        for(char Ch : Str.toCharArray()) {
            if(Character.isLowerCase(Ch)) {

                Result += Character.toUpperCase(Ch);
            }
            else if(Character.isUpperCase(Ch)) {

                Result += Character.toLowerCase(Ch);
            }
        }
        return Result;
    }
    public static void main(String[] args) {
        String Str = "Java";
        System.out.print(Toggle(Str));
    }
}

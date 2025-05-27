package Assignment4;

public class PalindromeCheck {
    public static boolean CheckPalindrome(String Str1, int Left, int Right) {

        while (Left < Right) {
            char LeftChar = Str1.charAt(Left);
            char RightChar = Str1.charAt(Right);
            if(!Character.isLetterOrDigit(LeftChar)){
                Left++;
            }
            else if(!Character.isLetterOrDigit(RightChar)) {
                Right--;
            }
            else {
                if(Character.toLowerCase(LeftChar) != Character.toLowerCase(RightChar)) {
                    return false;
                }
                Left++;
                Right--;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String Str1 = "Mal a yal am";
        int Left = 0;
        int Right = Str1.length() - 1;
        System.out.print(CheckPalindrome(Str1, Left, Right));
    }
}

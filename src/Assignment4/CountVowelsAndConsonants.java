package Assignment4;

public class CountVowelsAndConsonants {
    public static void CountVowAndCons(String Str) {
        int VowCount = 0;
        int ConsCount = 0;
        for(char Ch : Str.toCharArray()) {
           char LowChar = Character.toLowerCase(Ch);
            if(LowChar == 'a' || LowChar == 'e' || LowChar == 'i' || LowChar == 'o' || LowChar == 'u') {
                VowCount++;
            }
            else {
                if(Character.isLetter(LowChar)) {
                    ConsCount++;
                }

            }
        }
        System.out.println("Vowels :" + VowCount + ", Consonants :" + ConsCount);
    }
    public static void main(String[] args) {
        String Str = "Java Programming";
        CountVowAndCons(Str);
    }
}

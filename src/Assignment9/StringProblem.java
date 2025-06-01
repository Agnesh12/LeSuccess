package Assignment9;

public class StringProblem {
    public static void main(String[] args) {
        String Str = "aba";
        int Current = 0;
        int Num = 10;
        String Result = "";
        boolean Check = false;
        for(int i = 0; i < Num; i++) {
            Result += Str.charAt(Current);
            if(Current == 0 || Current == (Str.length() - 1)) {
                Check = !Check;
               if( Current == (Str.length() - 1)) {
                   Result += Str.charAt(Current);
               }
            }

            Current += (Check) ? 1 : -1;
        }
        int aCount = 0;
        for(int i = 0; i < Result.length(); i++) {
            char Ch = Result.charAt(i);
            if(Ch == 'a') {
                aCount++;
            }
        }
        System.out.println(aCount);
    }
}

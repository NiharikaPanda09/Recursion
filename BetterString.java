import java.util.*;
public class BetterString {
    public static void main(String[] args) {
               String str1 = "gfg";
               String str2 = "ggg";
        System.out.println(betterString(str1,str2));
    }
    public static String betterString(String str1, String str2) {
       return getSetCount(str1) >= getSetCount(str2) ?str1:str2;
    }
    private static int  getSetCount(String s){
        int [] last = new int[256];//ASCII values
        int accum = 1;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            int prev = accum;
            accum = (accum*2) - last[ch];
           last[ch] = prev;
        }
        return accum;

    }
}
//getSeqCount(str1):
//
//accum starts at 1.
//For 'g': prev = 1, accum = (1 * 2) - last['g'] (initially 0) = 2, last['g'] = 1.
//For 'f': prev = 2, accum = (2 * 2) - last['f'] (initially 0) = 4, last['f'] = 2.
//For 'g': prev = 4, accum = (4 * 2) - last['g'] (previously 1) = 7, last['g'] = 4.
//Final accum (7) represents the distinct subsequences for "gfg".
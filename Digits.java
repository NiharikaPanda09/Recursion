import java.util.*;
public class Digits {
    public static void main(String[] args) {
        int ans = SoD(134);
        System.out.println(ans);
    }
    public static int SoD(int n){
        if(n==0){
            return 0;
        }
        return n%10 + SoD(n/10);
    }
}

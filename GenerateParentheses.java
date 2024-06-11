import java.util.*;
public class GenerateParentheses {
    public static void main(String[] args) {
                 int n = 3;
        System.out.println(generateParenthesis(n));
    }
    public static  List<String> generateParenthesis(int n) {
          List<String> ans = new ArrayList<>();
          find(ans,"",0,0,n);
          return ans;
    }
    public static void find(List<String> ans,String currString, int o,int c,int n){
           if(currString.length() == n*2){
               ans.add(currString);
               return;
           }
           if(o<n){
               find(ans,currString + "(",o+1,c,n);
           }
           if(c<o){
               find(ans,currString + ")",o,c+1,n);
           }


    }
}

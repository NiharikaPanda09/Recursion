import java.util.*;
public class PowOfthree {
    public static void main(String[] args) {
        int n= 1;
        System.out.println(isPowerOfThree(n));
    }
    public static boolean isPowerOfThree(int n) {
          if(n==0 || n<0)
              return false;
          if(n==1){
              return true;
          }
          return (n%3==0) && isPowerOfThree(n/3);

    }
}

import java.util.*;
public class Printnum {
    public static void main(String[] args) {

        fun(5);
    }
    public static void fun(int n){
        if(n==0){
            return;
        }
        if(n==12){
            return;
        }
        //System.out.println(n);
        fun(n+1);
        System.out.println(n);

    }
}
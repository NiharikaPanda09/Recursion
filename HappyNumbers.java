import java.util.*;
public class HappyNumbers {
    public static void main(String[] args) {
       int n = 19;
        System.out.println(isHappy(n));
    }
//    public static boolean isHappy(int n) {
//         int slow = n;
//         int fast =n;
//
//         do{
//             slow = square(slow);
//             fast = square(square(fast));
//         }
//         while (slow!= fast);
//             return slow==1;
//
//    }
//    private static int square(int n){
//        int ans =0;
//        while(n>0){
//            int rem = n%10;
//            ans += rem*rem;
//            n /= 10;
//        }
//        return ans;
//    }

    public static boolean isHappy(int n) {
            Set<Long> isSeen = new HashSet<>();
            long m = n;
            while(m !=1 && !isSeen.contains(m)){
                isSeen.add(m);
                long sum =0;
                        while(m>0){
                            long rem = m%10;
                            sum += rem*rem;
                            m /= 10;
                        }
                        m= sum;
            }
            return m==1;

    }
    }
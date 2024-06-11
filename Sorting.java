import java.util.*;
public class Sorting {
    public static void main(String[] args) {
        int [] arr = {2,4,6,17,10};

        System.out.println(Sort(arr,0));

    }
   static boolean Sort(int []arr, int index){
        if(index == arr.length-1){
            return true;
        }
        return arr[index] < arr[index+1] && Sort(arr,index+1);

   }
}

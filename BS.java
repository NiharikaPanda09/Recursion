import java.util.*;
public class BS {
    public static void main(String[] args) {
        int [] arr = {1,4,7,67,98,123};
        int target = 123;
        System.out.println(BinarySearch(arr,target,0, arr.length-1));

    }
    static int BinarySearch(int[] arr, int target, int s, int e){
        if(s>e){
            return -1;

        }
        int mid = s +(e-s)/2;
        if(target == arr[mid]){
            return mid;
        }
        if(target > arr[mid]){
         return   BinarySearch(arr,target,s+1,e);
        }
       return BinarySearch(arr,target,s,e-1);
    }
}

import java.util.*;
import java.util.Arrays;
public class LinearSearch {
    public static void main(String[] args) {
        int [] arr={7,10,11,45,6};
        System.out.println(Search(arr,10,0));
        System.out.println(SearchIndex(arr,10,0));
        System.out.println(SearchLast(arr,10, arr.length-1));

    }

    static boolean Search(int[] arr, int target, int index) {
        if (index == arr.length) {
            return true;
        }
        return arr[index] == target || Search(arr, target, index + 1);
    }

    static int  SearchIndex(int[] arr, int target, int index) {
        if (index == arr.length) {
            return -1;
        }
        if(arr[index] == target){
            return index;
        }else{
            return SearchIndex(arr,target,index+1);
        }
    }
    static int SearchLast(int [] arr, int target, int index){
        if (index == arr.length) {
            return -1;
        }
        if(arr[index] == target){
            return index;
        }else{
            return SearchLast(arr,target,index-1);
        }
    }
    static ArrayList<Integer> list= new ArrayList<>();
    static void SearchAllIndex(int [] arr, int target, int index) {
        if (index == arr.length) {
            return;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        SearchAllIndex(arr, target, index + 1);
    }

}

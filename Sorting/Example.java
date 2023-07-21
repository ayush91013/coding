package Sorting;
import java.util.*;
class Example {
    public static void main(String[] args){
        int arr[] = {2,1,5,3,8,0};
        Arrays.sort(arr,1,5);
        System.out.println(Arrays.toString(arr));
        Integer arr1[] = {3,15,52,2,1,16};
        Arrays.sort(arr1, Collections.reverseOrder());
        System.out.print(Arrays.toString(arr1));
    }
}
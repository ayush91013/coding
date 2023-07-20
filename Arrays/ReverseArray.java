package Arrays;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Please Enter the number of elements in Array: ");
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        for(int i = 0; i<n; i++){
            arr1[i] = sc.nextInt();
        }
        int[] arr = reverseArray(arr1,0,n-1);
        for(int i = 0; i<n; i++){
            System.out.println(arr[i]);
        }
    }
    static int[] reverseArray(int[] arr, int start, int end){
        int temp;
        if(start>=end){
            return arr;
        }
        temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        reverseArray(arr, start+1, end-1);
        return arr;
    }
}

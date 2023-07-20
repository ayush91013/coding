package Sorting;
import java.util.*;
public class Selection_Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter the number of numbers in the array: ");
        int n = sc.nextInt();
        long arr[] = new long[n];
        System.out.println("Please Enter Numbers: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        long res[] = Selection(arr);
        for(int l = 0; l<n; l++){
            System.out.print(res[l]+ " ");
        }
    }
    static long[] Selection(long[] arr){
        int n = arr.length;
        for(int j=0; j<n-1; j++){
            int min_idx = j;
            for(int k =j+1; k<n; k++){
                if(arr[k]<arr[min_idx]){
                    min_idx = k;
                }
            }
            if(j != min_idx){
                long temp = arr[min_idx];
                arr[min_idx] = arr[j];
                arr[j] = temp;
            }
        }
        return arr;
    }
}

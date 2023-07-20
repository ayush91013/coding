package Sorting;
import java.util.*;
public class Insertion_Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter the number of Elements in Array: ");
        int n = sc.nextInt();
        int[]  arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int[] res = new int[n];
        res = Insertion(arr);
        for(int i =0; i<n; i++){
            System.out.print(res[i] + " ");
        }
    }
    static int[] Insertion(int arr[]){
        int n = arr.length;
        for(int i  = 1; i<n; i++){
            int key = arr[i];
            int j = i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
        return arr;
    }
}

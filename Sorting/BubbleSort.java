package Sorting;
import java.util.*;
public class BubbleSort {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter the number of numbers in Array to be Sorted: ");
        int n = sc.nextInt();
        long arr[] = new long[n];
        for(int i = 0; i<n; i++){
            if(i%10==0)
                System.out.print("Please Enter the "+(i+1)+ "st number of the string: ");
            else if((i-1)%10 == 0)
                System.out.print("Please Enter the "+(i+1)+ "nd number of the string: ");
            else if((i-2)%10 == 0)
                System.out.print("Please Enter the "+(i+1)+ "rd number of the string: ");
            else
                System.out.print("Please Enter the "+(i+1)+ "th number of the string: ");
            arr[i] = sc.nextLong();
        }
//        long arr[] = {2,4,1,64,8,32,16};
//        long n = arr.length;
        long[] ans = Bubble(arr);
        for(int l =0; l<n; l++){
            System.out.print(ans[l]+" ");
        }
    }
        static long[] Bubble(long[] arr){
        int n = arr.length;
        for(int j = 0; j<n-1; j++){
            boolean swap = false;
            for(int k = 0; k<n-j-1; k++){
                if(arr[k]>arr[k+1]){
                    long temp = arr[k];
                    arr[k] = arr[k+1];
                    arr[k+1] = temp;
                    swap = true;
                }
            }
            if(!swap){ // swap == false
                break;
            }
        }
        return arr;
    }
}

package Searching;

public class BinarySearchIterative {
    static int fun(int arr[], int x){
        int low = 0;
        int n = arr.length;
        int high = n-1;
        while(low<=high){
            int mid = (low + high)/2;
            if(arr[mid]==x){
                return mid;
            }
            else if(arr[mid]<x){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        int x = 6;
        System.out.print(fun(arr,x));
    }
}

package Searching;

public class BinarySearchRecursive {
    static int BinarySearch(int arr[],int x, int low, int high){
        if(low>high){
            return -1;
        }
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid] == x){
                return mid;
            }
            else if(arr[mid]>x){
                return BinarySearch(arr,x,low,mid-1);
            }
            else{
                return BinarySearch(arr,x,mid+1,high);
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int arr[] = {10,20,30,40,50,60,20};
        int y=20;
        System.out.print(BinarySearch(arr,y,0,arr.length-1));
    }
}

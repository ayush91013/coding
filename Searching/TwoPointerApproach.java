package Searching;

public class TwoPointerApproach {
    static Boolean isPair(int arr[], int x){
        int n = arr.length;
        int left = 0, right =n-1;
        while(left<right){
            if(arr[left]+ arr[right] == x){
                return true;
            }
            else if(arr[left] + arr[right] > x){
                right --;
            }
            else{
                left++;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[] = {3,4,8,9,20,40};
        int x = 29;
        boolean y = isPair(arr, x);
        System.out.print(y);
    }
}

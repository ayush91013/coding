package Searching;

public class RepeatingElement {
    static int findRepeating(int arr[]){
 /* if first element is 1
        int slow = arr[0], int fast = arr[0];
        int n = arr.length;
        do{
            slow = arr[slow];
            fast = arr[arr[fast]];
        }
        while(slow != fast);
        slow = arr[0];
        while(slow != fast){
            slow = arr[slow];
            fast = arr[fast];
        }
        return slow;
        */

        // if first element is 0
        int slow = arr[0] +1;
        int fast = arr[0]+1;
        do{
            slow = arr[slow];
            fast  = arr[arr[fast]];
        }
        while(slow != fast);
        slow = arr[0] +1 ;
        while (slow != fast){
            fast =  arr[fast]+ 1;
            slow = arr[slow] + 1;
        }
        return slow+1;
    }
    public static void main(String[] args){
        int arr[] ={0,2,1,3,5,4,6,2};
        System.out.print(findRepeating(arr));
    }
}

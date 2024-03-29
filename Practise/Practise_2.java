package Practise;
import java.util.*;
public class Practise_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter the Number of House: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        int ans = rob(arr);
        System.out.print(ans);
    }
    //2 7 9 1 2 5
    static int rob(int arr[]){
        final int n = arr.length;
        if(n==0)
            return 0;
        if(n==1)
            return arr[0];
        int[] dp =  new int[n];
        dp[0] = arr[0];
        dp[1] = Math.max(arr[0], arr[1]);
        for(int i=2; i<n; i++){
            dp[i] = Math.max(dp[i-1], dp[i-2]+arr[i]);
        }
        return dp[n-1];
    }
}

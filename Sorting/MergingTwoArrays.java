package Sorting;
import java.util.*;
public class MergingTwoArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter the Number of Elements in First String: ");
        int m = sc.nextInt();
        System.out.println("Please Enter the Number of Elements in Second String: ");
        int n = sc.nextInt();
        int[] a = new int[m];
        int[] b = new int[n];
        System.out.println("Please Enter the Elements of First String: ");
        for(int i = 0; i<m; i++){
            a[i] = sc.nextInt();
        }
        System.out.println("Please Enter the Elements of Second String: ");
        for(int i = 0; i<n; i++){
            b[i] = sc.nextInt();
        }
        int[] c = Merge(a,b);
        for(int i = 0; i < m+n; i++){
            System.out.print(c[i]+" ");
        }

    }
    static int[] Merge(int[] a, int[] b){
        int n = a.length, m = b.length;
        int[] c = new int[m+n];
        int j=0, k = 0;
        while(j<n || k<m){
            if(k == m){
                c[j+k] = a[j];
                j++;
            }
            else if(j == n){
                c[j+k] = b[k];
                k++;
            }
            else if(a[j]<=b[k]){
                c[j+k] = a[j];
                j++;
            }
            else{
                c[j+k] = b[k];
                k++;
            }
        }
        return c;
    }
}

package Arrays;

import java.util.Scanner;

public class LeftRotateBy_D_Places {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter D");
        int d = sc.nextInt();
        int arr[] = {1,2,3,4,5,6,7};
        int arr2[] = new int[d];
        d = d%arr.length;
        for(int k = 0; k<d; k++){
            arr2[k] = arr[k];
        }

        for(int i = d; i<arr.length; i++){
            arr[i-d] = arr[i];
        }
        for(int j=0; j<d; j++){
            arr[arr.length-d+j] = arr2[j];
        }

        for(int l = 0; l<arr.length; l++){
            System.out.println(arr[l]);
        }
    }
}

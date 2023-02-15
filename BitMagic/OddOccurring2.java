package BitMagic;

import java.util.Scanner;

public class OddOccurring2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter the Number of integers in array: ");
        int a = sc.nextInt();
        int b[] = new int[a];
        for (int i = 0; i < a; i++) {
            b[i] = sc.nextInt();
        }
        int res=0,res1=0,res2=0;
        for(int j=0;j<a;j++){
            res=res^b[j];
        }
        int c = res & ~(res-1);
        for(int k=0; k<a; k++){
            if((b[k]&c)==1){
                res1=res1^b[k];
            }
            else{
                res2=res2^b[k];
            }
        }
        System.out.println(res1);
        System.out.println(res2);
    }
}

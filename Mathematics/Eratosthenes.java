package Mathematics;

import java.util.Scanner;

public class Eratosthenes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter the Number: ");
        int n = sc.nextInt();
        for(int i = 2; i<n; i++){
            for(int j = 2; j<i; j++){
                if(i%j==0){

                }
            }
        }
    }
    public static Boolean Prime2(int a){
        if(a<=1){
            return false;
        }
        for(int i=2; i<a;i++){
            if(a%i==0) {
                return false;
            }
        }
        return true;
    }
}

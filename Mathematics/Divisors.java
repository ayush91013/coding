package Mathematics;

import java.util.Scanner;

public class Divisors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter the Number: ");
        int n = sc.nextInt();
        for(int i=1; i*i<=n;i++){
            if(n%i==0){
                System.out.println(i);
                if(i != n/i){
                    System.out.println(n/i);
                }
            }
        }
    }
}

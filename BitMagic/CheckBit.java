package BitMagic;

import java.util.Scanner;

public class CheckBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter the Number: ");
        int a = sc.nextInt();
        System.out.println("Please Enter the kth bit: ");
        int k = sc.nextInt();
        int c =a<<(k-1);
        int d = a&c;
        if(d != 0){
            System.out.print("Yes");
        }
        else{
            System.out.print("No");
        }
    }
}

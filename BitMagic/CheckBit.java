package BitMagic;

import java.util.Scanner;

public class CheckBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter the Number: ");
        int a = sc.nextInt();
        System.out.println("Please Enter the kth bit: ");
        int k = sc.nextInt();
//        if((a&(1<<(k-1))) != 0){
//            System.out.print("Yes");
//        }
//        else{
//            System.out.print("No");
//        }
        if(((a>>(k-1))&1) != 0){
            System.out.print("Yes");
        }
        else{
            System.out.print("No");
        }
    }
}

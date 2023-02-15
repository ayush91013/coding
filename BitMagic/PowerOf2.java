package BitMagic;

import java.util.Scanner;

public class PowerOf2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter the Number: ");
        int a = sc.nextInt();
//        double c = (Math.log(a))/(Math.log(2));
//        int b = (int) c;
//        double d = Math.pow(2,b);
//        long e = (long) d;
        if((a&(a-1))==0){
            System.out.print("Power of 2");
        }
        else{
            System.out.print("Not pof 2");
        }
    }
}

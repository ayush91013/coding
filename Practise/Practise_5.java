package Practise;
import java.util.*;
public class Practise_5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter the Number: ") ;
        long l = sc.nextLong();
        long a = l%10;
        long b = l%10;
        if(l<10){
            System.out.print(l);
        }
        while(l>0){
            long c = l%10;
            a = Math.min(c,a);
            b = Math.max(c,b);
            l = l/10;
        }
        System.out.println("Smallest: ");
        System.out.println(a);
        System.out.println("largest: ");
        System.out.println(b);
    }
}
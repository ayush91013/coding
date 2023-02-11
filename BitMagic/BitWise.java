package BitMagic;


import java.util.Scanner;

public class BitWise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter the First Number: ");
        int a = sc.nextInt();
        System.out.println("Please Enter the Second Number: ");
        int b = sc.nextInt();
        System.out.print("Bitwise And: ");
        System.out.println(a&b);
        System.out.print("Bitwise Or: ");
        System.out.println(a|b);
        System.out.print("Bitwise Xor: ");
        System.out.println(a^b);
    }
}

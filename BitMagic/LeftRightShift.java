package BitMagic;

import jdk.jfr.Unsigned;

import java.util.Scanner;

public class LeftRightShift {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter the Number: ");
        int a = sc.nextInt();
        System.out.println("Please Enter the Shift Number: ");
        int b = sc.nextInt();
        int x = 1;
        //String y= Integer.toUnsignedString(x);
        System.out.println("Left Shift");
        System.out.println(a<<b);
        System.out.println("Right Shift");
        System.out.println(a>>b);
        System.out.println("Bitwise Not");
        System.out.println(~x);
    }
}

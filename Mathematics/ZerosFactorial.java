package Mathematics;
import java.util.*;
public class ZerosFactorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter the Number: ");
        int a = sc.nextInt();
        int b = 0;
        for (int i = 5;i<=a;i=i*5){
            b = b+a/i;
        }
        System.out.print(b);
    }
}

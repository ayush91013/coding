package Mathematics;
import java.util.*;
public class AP {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter First Number: ");
        int a = sc.nextInt();
        System.out.println("Please Enter Number: ");
        int n = sc.nextInt();
        System.out.println("Please Enter difference: ");
        int d = sc.nextInt();
        int b = a+ (n-1)*d;
        System.out.print(b);
    }
}

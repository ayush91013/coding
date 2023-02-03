package Mathematics;
import java.util.*;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter the Number: ");
        int a = sc.nextInt();
        int n = 1;
        for (int i = 1;i<=a;i++){
            n = n*i;
        }
        System.out.print(n);
    }
}

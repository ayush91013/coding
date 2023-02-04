package Mathematics;
import java.util.*;
public class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter the First Number: ");
        int a = sc.nextInt();
        System.out.println("Please Enter the Second Number: ");
        int b = sc.nextInt();
        int res = Math.max(a,b);
        while(res>0) {
            if (res % a == 0 && res % b == 0) {
                System.out.println(res);
                break;
            }
            res = res + 1;
        }
    }
}

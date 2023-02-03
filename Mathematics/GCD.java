package Mathematics;
import java.util.*;
public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter the First Number: ");
        int a = sc.nextInt();
        System.out.println("Please Enter the Second Number: ");
        int b = sc.nextInt();
        int res = Math.min(a,b);
        while(res>0){
            if(a%res==0 && b%res==0){
                break;
            }
            res = res-1;
        }
        System.out.print(res);
    }
}

package Mathematics;
import java.util.*;
public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter the First Number: ");
        int n = sc.nextInt();
        Boolean result = Prime2(n);
        System.out.println(result);

    }
    public static Boolean Prime2(int a){
        if(a<=1){
            return false;
        }
        for(int i=2; i<a;i++){
            if(a%i==0) {
                return false;
            }
        }
        return true;
    }
}

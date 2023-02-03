package Mathematics;
import java.util.*;
public class CountDigitsRecursive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count=0;
        System.out.println("Please Enter The Number: ");
        int k = sc.nextInt();
        int result = Count(k);
        System.out.print(result);

    }
    public static int Count(int n){
        if(n==0){
            return 0;
        }
        return 1 + Count(n/10);
    }
}

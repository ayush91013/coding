package BitMagic;

import java.util.Scanner;

public class OddOccurring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter the Number of integers in array: ");
        int a = sc.nextInt();
        int b[] = new int[a];
        int count = 0;
        for(int i = 0; i<a; i++){
            b[i] = sc.nextInt();
        }
        for(int j = 0; j<a; j++){
            if((b[j]&1)==1){
                System.out.println(b[j]);
                count++;
            }
        }
        System.out.println("Total number of odd occur: ");
        System.out.println(count);
    }
}

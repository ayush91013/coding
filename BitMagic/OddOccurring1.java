package BitMagic;

import java.util.Scanner;

public class OddOccurring1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter the Number of integers in array: ");
        int a = sc.nextInt();
        int b[] = new int[a];
        for (int i = 0; i < a; i++) {
            b[i] = sc.nextInt();
        }
//        for(int j=0; j<a;j++){
//            int count=0;
//            for(int k=0;k<a;k++){
//                if(b[j]==b[k]){
//                    count++;
//                }
//            }
//            if((count&1)==1){
//                System.out.print(b[j]);
//                break;
//            }
//        }
        int res=0;
        for(int j=0;j<a;j++){
            res=res^b[j];
        }
        System.out.print(res);
    }
}


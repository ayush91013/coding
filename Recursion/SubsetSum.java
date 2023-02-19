package Recursion;

public class SubsetSum {
    // without recursion
//    static void fun(int  arr[], int sum){
//        int count = 0;
//        for(int i = 0; i<arr.length; i++){
//            for(int j=i+1; j<arr.length; j++){
//                if(sum==arr[i]+arr[j]){
//                    count ++;
//                }
//                int c = arr[i]+arr[j];
//                for(int k = j+1; k<arr.length; k++){
//                    if(c+arr[k] == sum){
//                        count ++;
//                    }
//                }
//            }
//        }
//        System.out.print(count);
//    }
//
//    public static void main(String[] args) {
//        int[] arr2 = {1,2,3,4,5,6,7,8,9,10};
//        fun(arr2,9);
//    }
    // with recursion
    static int fun(int arr[], int n, int sum){
        if(n==0){
            return (sum==0)? 1:0;
        }
        return (fun(arr,n-1,sum)+fun(arr,n-1,sum-arr[n-1]));
    }

    public static void main(String[] args) {
        int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(fun(arr2,arr2.length,12));
    }

}

package Arrays;

public class StockBoyAndSell {
    public static void main(String args[]){
        int[] arr = {1,5,3,1,2,8};
        int n = arr.length;
//        int temp = arr[0];
//        int temp1 = arr[0];
//        int count = 0;
//        for(int i = 0; i<n; i++){
//            for(int j = i+1; j<n; j++){
//                if(temp<arr[j]){
//                    temp = arr[j];
//                }
//                else{
//                    count = count+temp-temp1;
//                    temp = arr[j];
//                    temp1 = arr[j];
//                    break;
//                }
//            }
//        }
        int count = 0;
        for(int i=1; i<n; i++){
            if(arr[i] > arr[i-1]){
                count = count + arr[i] - arr[i-1];
            }
        }
        System.out.println(count);
    }
}

package Arrays;

public class WindowSlidingTechnique {
    static Boolean sum(int arr[],int sum){
        int n = arr.length;
//        for(int i = 0; i<n; i++){
//            int sum =0;
//            for(int j=i;j<n;j++){
//                sum+=arr[j];
//                if(sum==givenSum){
//                    return true;
//                }
//            }
//        }
//        return false;
        int curr_sum=arr[0], s=0;
        for (int e = 1; e < n; e++) {
            while(curr_sum>sum && s<e-1){
                curr_sum -= arr[s];
                s++;
            }
            if(curr_sum==sum){
                return true;
            }
            if(e<n){
                curr_sum += arr[e];
            }
        }
        return(curr_sum == sum);

    }
    public static void main(String[] args) {
        int[] arr = {1, 4, 20, 3, 10, 5};
        int n = arr.length;
        int sum = 33;
        System.out.print(sum(arr,sum));
//    }

    }
}

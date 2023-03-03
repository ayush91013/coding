package Arrays;

public class CircularSubArray {
    static int normalMaxSum(int arr[],int n){
        int res = arr[0], maxEnding =0;
        for(int i =0; i<n; i++){
            maxEnding = Math.max(arr[i],maxEnding + arr[i]);
            res = Math.max(res,maxEnding);
        }
        return res;
    }
    static int overallMaxSum(int arr[], int n){
        int max_normal = normalMaxSum(arr,n);
        if(max_normal<0){
            return max_normal;
        }
        int arr_sum = 0;
        for(int j =0; j<n; j++){
            arr_sum += arr[j];
            arr[j] = -arr[j];
        }
        int max_circular = arr_sum + normalMaxSum(arr,n);
        return Math.max(max_normal, max_circular);
    }
    public static void main(String[] args){
        int arr[] = {8,-4,3,-5,4};
        int n = arr.length;
        int max_circular_sum = overallMaxSum(arr,n);
        System.out.print(max_circular_sum);
    }

}

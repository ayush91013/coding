package Arrays;

public class Leaders {
    public static void main(String[] args){
        int arr[] = {7,10,4,3,6,5,2};
        for(int i = 0; i<arr.length; i++){
            int count =0;
            for(int j = i+1; j<arr.length; j++){
                if(arr[i] < arr[j]){
                    count ++;
                    break;
                }
            }
            if(count == 0){
                System.out.println(arr[i]);
            }
        }
    }
}

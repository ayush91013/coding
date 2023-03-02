package Arrays;

public class FrequenciesInSortedArrays {
    public static void main(String args[]){
        int arr[] = {10,10,10,25,30,30};
        int count =1;
        for(int i = 0 ; i <arr.length-1; i++){
            if(arr[i] == arr[i+1]){
                count ++;
            }
            if(arr[i] != arr[i+1]) {
                System.out.println(arr[i] + " " + count);
                count =1;
            }
        }
        System.out.println(arr[arr.length-1] + " " + count);
    }
}

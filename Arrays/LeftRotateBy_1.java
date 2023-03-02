package Arrays;

public class LeftRotateBy_1 {
    public static void main(String[] args){
        int arr[] = {1,2,3,4,5};
//        int arr2[] = new int[arr.length];

//        for(int i=0; i<arr.length-1; i++){
//            arr2[i] = arr[i+1];
//        }
//        arr2[arr.length-1] = arr[0];
//        for(int j = 0; j<arr2.length; j++){
//            System.out.println(arr2[j]);
//        }
        int temp = arr[0];
        for(int i =1; i<arr.length; i++){
            arr[i-1]=arr[i];
        }
        arr[arr.length-1] = temp;
        for(int j = 0; j<arr.length; j++){
            System.out.println(arr[j]);
        }
    }
}

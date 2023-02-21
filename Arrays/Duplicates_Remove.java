package Arrays;

public class Duplicates_Remove {
    public static void main(String[] args) {
        int arr[]= {10,20,20,30,30,30,30};
        int arr2[] = new int[arr.length];
        arr2[0] = arr[0];
        int res = 1;
        for(int i = 1; i<arr.length; i++){
            if(arr[i] != arr[i-1]){
                arr2[res] = arr[i];
                res++;
            }
        }
        for(int j = 0; j<res; j++){
            System.out.println(arr2[j]);
        }
        System.out.println(res);
    }
}

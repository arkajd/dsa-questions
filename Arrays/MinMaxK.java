import java.util.Arrays;

public class MinMaxK {
    
    public static void main(String[] args) {
        int[] arr = {5,2,3,4,-5};
        int k = 1;
        printKMin(arr, k);
        printKMax(arr, k);
    }

    // print kth largest element in the array
    private static void printKMax(int[] arr, int k){
        Arrays.sort(arr);
        System.out.println(arr[arr.length-k]);
    }

    // print kth smallest element in the array
    static void printKMin(int[] arr, int k){
        Arrays.sort(arr);
        System.out.println(arr[k-1]);
    }
    
}

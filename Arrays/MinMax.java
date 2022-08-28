import java.util.Scanner;

public class MinMax {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = scanner.nextInt();
        }

        findMinMax(arr);
        scanner.close();
    }

    // find minimum and maximum element of an array
    private static void findMinMax(int[] arr){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){
            if(arr[i]<min){
                min = arr[i];
            }

            if(arr[i]>max){
                max = arr[i];
            }
        }
        
        System.out.println(min + "-" + max);
    }
    
}

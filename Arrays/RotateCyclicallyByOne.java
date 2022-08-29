public class RotateCyclicallyByOne {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        rotateByOne(arr);
        print(arr);
    }

    // rotate array by 1 cyclically
    private static void rotateByOne(int[] arr){
        if(arr.length==1){
            return;
        }
        int temp = arr[arr.length-1];

        for(int i=arr.length-1; i>0; i--){
            arr[i] = arr[i-1];
        }
        arr[0] = temp;
    }

    private static void print(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
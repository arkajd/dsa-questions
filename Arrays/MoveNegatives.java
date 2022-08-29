public class MoveNegatives {
    
    public static void main(String[] args) {
        int[] arr = {-12, 11, -13, -5, 6, -7, 5, -3, -6};
        int[] result = moveNegativesLeft(arr);
        print(result);
    }

    // move negative elements to the left of the array (using 2 pointer technique)
    private static int[] moveNegativesLeft(int[] arr){
        int i = 0;
        int j = arr.length -1;

        while(i<j){
            if(arr[i]>=0 && arr[j]<0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            else if(arr[i]>=0 && arr[j]>=0){
                j--;
            }
            else if(arr[i]<0 && arr[j]<0){
                i++;
            }
            else{
                i++;
                j--;
            }
        }
        return arr;
    }

    private static void print(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}

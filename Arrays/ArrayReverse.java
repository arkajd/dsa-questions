class ReverseJava{
    
    public static void main(String[] args) {

        int[] arr = {1, 1, 2, -1};
        int[] output = reverse(arr);

        for(int i=0; i<arr.length; i++){
            System.out.println(output[i]);
        }
    }

    private static int[] reverse(int[] arr){

        int i = 0;
        int j = arr.length-1;

        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        return arr;
    }
}
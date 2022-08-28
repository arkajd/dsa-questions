public class Sort012 {

    public static void main(String[] args) {
        int[] arr = {1,0,0,2,1,0,2,1,2,0};
        int[] sorted = sort012Array(arr);

        for(int i=0; i<sorted.length; i++){
            System.out.println(sorted[i]);
        }
    }

    // sort array consisting of 0, 1 and 2 without using any sorting technique
    private static int[] sort012Array(int[] arr){
        int count0 = 0;
        int count1 = 0;

        for(int i=0; i<arr.length; i++){
            if(arr[i]==0){
                count0++;
            }
            if(arr[i]==1){
                count1++;
            }
        }

        for(int i=0; i<arr.length; i++){
            if(count0>0){
                arr[i] = 0;
                count0--;
            }
            else if(count1>0){
                arr[i] = 1;
                count1--;
            }
            else{
                arr[i] = 2;
            }
        }

        return arr;
    }
    
}

public class MaxContiguousSum {
    
    public static void main(String[] args) {
        int[] arr = {1,2,3,-2,5};
        int max = findMaxSumContiguous(arr);
        System.out.println(max);
    }
    
    // find max sum contiguous subarray (using kadane's algorithm)
    private static int findMaxSumContiguous(int[] arr){
        int sum = 0;
        int maxSum = 0;

        for(int i=0; i<arr.length; i++){
            sum = sum + arr[i];

            if(sum>maxSum){
                maxSum = sum;
            }
            if(sum<0){
                sum = 0;
            }
        }
        return maxSum;
    }
}

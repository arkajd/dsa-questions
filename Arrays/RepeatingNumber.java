import java.util.HashSet;

public class RepeatingNumber {
    
    public static void main(String[] args) {
        int[] arr = {3,1,3,4,2};
        int result = findDuplicate(arr);
        System.out.println(result);
    }

    // find duplicate in an array of n+1 size where each element can be of range 1 to n
    private static int findDuplicate(int[] nums){
        int output = 0;
        HashSet<Integer> set = new HashSet<>();
        
        for(int i=0; i<nums.length; i++){
            if(set.contains(nums[i])){
                output = nums[i];
                break;
            }
            set.add(nums[i]);
        }
        return output;
    }
}

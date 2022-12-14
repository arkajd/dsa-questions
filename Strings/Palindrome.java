package Strings;

public class Palindrome {

    public static void main(String[] args) {
        String str = "loyol loyal";
        System.out.println(checkPalindrome(str));
    }

    // compares left and right indexes, increasing and decreasing both by 1 respectively
    // until left is greater than right
    private static boolean checkPalindrome(String str){

        int left = 0;
        int right = str.length()-1;

        while(left<right){
            if(str.charAt(left) != str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    
}

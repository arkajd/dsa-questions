package Strings;

public class Reverse {

    public static void main(String[] args) {
        String str = "hello world";
        String rev = reverseString(str);
        System.out.println(rev);
    }

    // using 2 pointers
    private static String reverseString(String str){
        StringBuilder sbl = new StringBuilder(str);
        int left = 0;
        int right = sbl.length()-1;

        while(left<right){
            char l = sbl.charAt(left);
            char r = sbl.charAt(right);

            sbl.setCharAt(left, r);
            sbl.setCharAt(right, l);
            left++;
            right--;
        }
        return sbl.toString();
    }
    
}

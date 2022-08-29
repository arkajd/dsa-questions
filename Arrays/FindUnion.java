import java.util.HashSet;

public class FindUnion {
    
    public static void main(String[] args) {
        int[] a = {1,2, 3, 4, 5};
        int[] b = {1, 2, 3};
        printUnion(a, b);
    }

    // find union of 2 given arrays
    private static void printUnion(int[] a, int[] b){
        HashSet<Integer> set = new HashSet<Integer>();

        for(int i=0; i<a.length; i++){
            set.add(a[i]);
        }

        for(int i=0; i<b.length; i++){
            set.add(b[i]);
        }

        for(Integer i : set){
            System.out.println(i);
        }
    }
}

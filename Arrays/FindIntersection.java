import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FindIntersection {
    
    public static void main(String[] args) {
        int[] a = {1,2, 3, 4, 5};
        int[] b = {1, 2, 3};
        printIntersection(a, b);
    }

    // find intersection array of 2 given arrays
    private static void printIntersection(int[] a, int[] b){
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        List<Integer> list = new ArrayList<>();

        for(int i=0; i<a.length; i++){

            if(map.containsKey(a[i])){
                map.put(a[i], map.get(a[i])+1);
            }
            else{
                map.put(a[i], 1);
            }
        }

        for(int i=0; i<b.length; i++){

            if(map.containsKey(b[i])){
                list.add(b[i]);

                if(map.get(b[i])-1>0){
                    map.put(b[i], map.get(b[i])-1);
                }
                else{
                    map.remove(b[i]);
                }
            }
        }
        System.out.println(list);
    }
}

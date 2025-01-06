import java.util.Arrays;
import java.util.Collections;
public class InbuiltSort {
    public static void main(String[] args){
        int[] arr = {5,4,1,3,2};
        //sort in increasing order
        Arrays.sort(arr);
        System.out.println("Sorted array in increasing order: " + Arrays.toString(arr));
        //sort in decreasing order
        Integer[] arr2 = {5,4,1,3,2};
        Arrays.sort(arr2,Collections.reverseOrder());
        System.out.println("Sorted array in decreasing order: " + Arrays.toString(arr2));
    }
}

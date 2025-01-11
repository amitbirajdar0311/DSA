import java.util.Arrays;
public class CheckArrayIsSortedOrNot {
    public static void isSorted(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                System.out.println("not sorted");
                return;
            }
        }
        System.out.println("sorted");
        return;
    }
    public static boolean isSortedRecursssion(int[] arr, int i){
        //base case 
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return isSortedRecursssion(arr, i+1);
    }
    public static void main(String[] args){
        int[] arr= {2,3,4,1};
        // int[] arr2 = Arrays.copyOf(arr, arr.length);
        // arr2 = arr;
        // Arrays.sort(arr);
        // if(arr == arr2){
        //     System.out.println("Given array is sorted");
        // }
        // else{
        //     System.out.println("not sorted");
        // }
        
        // isSorted(arr);

        System.out.println(isSortedRecursssion(arr,0));
    }
}

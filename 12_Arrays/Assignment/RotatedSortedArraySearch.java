public class RotatedSortedArraySearch {
    public static int binarySearch(int[] arr, int key) {
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] == key){
                return mid;
            }
            //to check which half is sorted
            if(arr[start] <=arr[mid]){
                if(arr[start]<=key && key< arr[mid]){
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }
            else{
                if(arr[mid]<key && key<=arr[end]){
                    start = mid + 1;
                }
                else{
                    end = mid - 1;
                }
            }

        }
        return -1;  // key not found in the array
    }
    public static void main(String[] args) {
        int[] arr = {3,4,6,7,0,1,2};
        int key = 0;
        int index = binarySearch(arr, key);    
        System.out.println("Index of "+key+" is "+index);

    }
}

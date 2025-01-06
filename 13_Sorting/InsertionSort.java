public class InsertionSort {
    public static void insertionSort(int[] arr){
        for(int i=1;i<arr.length;i++){
            //to tract current element 
            int current = arr[i];
            //to track sorted portion 
            int j = i-1;
            while(j>=0 && arr[j] > current){
                arr[j+1] = arr[j];
                j--; 
            }
            arr[j+1] = current;
            
        }
    }
    public static void main(String[] args) {
        int[] arr = {5,4,1,3,2};
        insertionSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

import java.util.Arrays;
public class Sorting {
    public static void bubbleSort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    
    public static void selectionSort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            int small = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[small]>arr[j]){
                    small = j;
                }
            }
            if(small!=i){
                int temp = arr[small];
                arr[small] = arr[i];
                arr[i] = temp;
            }
        }
    }
    
    public static void insertionSort(int[] arr){
        for(int i=1;i<arr.length;i++){
            int j = i-1;
            int current = arr[i];
            while(j>=0 && current < arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = current;
        }
    }
    
    public static void countSort(int[] arr){
        int max  = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            max = Math.max(arr[i],max);
        }
        int[] freq = new int[max + 1];
        for(int i=0;i<arr.length;i++){
            freq[arr[i]]++;
        }
        int j=0;
        for(int i=0;i<freq.length;i++){
            while(freq[i]>0){
                arr[j]=i;
                j++;
                freq[i]--;
            }
        }
    }
    
    public static void main(String[] args) {
        int[] arr = {3,6,2,1,8,7,4,5,3,1};
        // bubbleSort(arr);
        // selectionSort(arr);
        // insertionSort(arr);
        // Arrays.sort(arr);
        countSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}

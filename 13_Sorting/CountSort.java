public class CountSort {
    public static void countSort(int[] arr) {
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            max = Math.max(max,arr[i]);
        }
        int[] freq = new int[max+1];
        for(int i=0;i<arr.length;i++){
            freq[arr[i]]++;
        }
        //for sorting 
        int j = 0;
        for(int i=0;i<freq.length;i++){
            while(freq[i]>0){
                arr[j] = i;
                freq[i]--;
                j++;
            }
        }
        //for decreasing order
        //  int j = arr.length-1;
        // for(int i=freq.length-1;i>=0;i--){
        //     while(freq[i]>0){
        //         arr[j] = i;
        //         freq[i]--;
        //         j--;
        //     }
        // }
    }
    public static void main(String[] args) {
        int[] arr = {1,4,1,3,2,4,3,7};
        countSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

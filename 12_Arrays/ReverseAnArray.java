public class ReverseAnArray {
    public static int[] reverse(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return arr;
    }
   
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,10};
        reverse(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        // for(int i=arr.length-1;i>=0;i--){
        //     System.out.print(arr[i] + " ");
        // }

    }    
}

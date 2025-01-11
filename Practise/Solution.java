public class Solution {
    public static void main(String[] args) {
       int[] arr = {3,2,8,2,9};
       int secondLargest = Integer.MIN_VALUE;
       int max = 0;
       for(int i=0;i<arr.length;i++) {
            max = Math.max(max,arr[i]);
       }
       for(int i=0;i<arr.length;i++){
        
        if(arr[i]>secondLargest && arr[i]!=max){
            secondLargest = arr[i];
        }
       }
       System.out.println("Second largest number in the array: " + secondLargest);
    }
}

public class LargestNumberInArray {

  public static int largestNumberInArray(int[] arr) {
    int largest = Integer.MIN_VALUE;
    for (int i = 0; i < arr.length; i++) {
      largest = Math.max(largest, arr[i]);
    }
    return largest;
  }

  public static int smallestNumberInArray(int[] arr) {
    int smallest = Integer.MAX_VALUE;
    for (int i = 0; i < arr.length; i++) {
      smallest = Math.min(smallest, arr[i]);
    }
    return smallest;
  }

  public static void main(String[] args) {
    int[] arr = { 1, 2, 6, 3, 5, 43 };
    int largest = largestNumberInArray(arr);
    int smallest = smallestNumberInArray(arr);
    System.out.println("Largest number in the array is: " + largest);
    System.out.println("Smallest number in the array is: " + smallest);
  }
}

import java.util.Arrays;

public class BubbleSort {

  public static void bubbleSort(int[] arr) {
    for (int i = 0; i < arr.length - 1; i++) {
      boolean swapped = false; // Reset swapped flag at the beginning of each pass

      for (int j = 0; j < arr.length - 1 - i; j++) {
        if (arr[j] > arr[j + 1]) {
          // Swap elements if they are in the wrong order
          int temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
          swapped = true; // Set flag to true if a swap occurs
        }
      }

      // If no swaps were made during this pass, array is already sorted
      if (swapped == false) {
        break;
      }
    }
  }

  public static void main(String[] args) {
    // int[] arr = { 64, 1, 3, 2, 34, 25, 12, 22, 11, 90 }; // Unsorted array
    int[] arr = { 1, 9, 2, 3, 4, 5, 6 }; // Already sorted array
    bubbleSort(arr);
    System.out.println("Sorted array: " + Arrays.toString(arr));
  }
}

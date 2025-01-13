public class LastOccrenceOfElementInArray {

  // public static int findLastOccurrence(int[] arr, int key , int i){
  //     if(i == -1){
  //         return -1;
  //     }
  //     if(arr[i] == key){
  //         return i;
  //     }
  //     return findLastOccurrence(arr, key, i-1);
  // }

  //another way to find last occurrence
  public static int findLastOccurrence(int[] arr, int key, int i) {
    //base case
    if (i == arr.length) {
      return -1;
    }

    int isFound = findLastOccurrence(arr, key, i + 1); // find last occurrence
    // if key is found in array and not found in remaining elements of array, return current index i
    if (isFound == -1 && arr[i] == key) {
      return i;
    }
    return isFound; // not found in array
  }

  public static void main(String[] args) {
    // int[] arr = {8,3,6,9,5,10,2,5,3};
    int[] arr = { 3, 3, 3, 3, 3, 3, 3, 2, 3 };
    int key = 3;
    // int checkAtIndex = arr.length - 1;
    // int lastOccurrence = findLastOccurrence(arr, key, checkAtIndex);

    //another way
    int lastOccurence = findLastOccurrence(arr, key, 0);
    System.out.println("found at index " + lastOccurence);
  }
}

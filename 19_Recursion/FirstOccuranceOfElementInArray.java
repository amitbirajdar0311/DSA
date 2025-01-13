public class FirstOccuranceOfElementInArray {
    public static int findFirstOccurance(int[] arr, int key, int i){

        //base case 
        if(i==arr.length)
            return -1;  //element not found in array

        
        //do some work in function 
        if(arr[i] == key){
            return i;
        }
        //recursive search
        return findFirstOccurance(arr, key, i+1);  //recursive call with updated index
    }
    public static void main(String[] args){
        int[] arr = {8,3,6,9,5,10,2,5,3};
        int key = 5;
        int serachIndex = 0;
        int index = findFirstOccurance(arr, key, 0);
        System.out.println("First occurrence of " + key + " is at index: " + index);
    }
}

import java.util.Scanner;
public class LinearSearch {
    public static int linearSearch(int[] arr , int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i] == key){
                return i;
            }

        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {2,4,6,8,10,12,14,16};
        int key = sc.nextInt();
        int index = linearSearch(arr, key);
        if(index == -1){
            System.out.println("Element not found");
        }else{
            System.out.println("Element found at index: " + index);
        }
        sc.close();
    }
}

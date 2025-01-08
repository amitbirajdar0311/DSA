public class PrintLargestString {
    public static void main(String[] args){
     String arr[] = {"apple", "mango","banana","grapes", "orange","AOIT"};
        String largest = "";
        for(int i=0;i<arr.length;i++){
            if(arr[i].compareTo(largest) >0){
                largest = arr[i];
            }
        }
        System.out.println("largest is : " + largest);
 
    }
}

public class PrintSubArrays {
    public static void printSubArray(int[] arr){
        int totalPairs = 0;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]+" ");
                }
                totalPairs++;
                System.out.print(":");
            }
            System.out.println();
        }
        System.out.println("Total Pairs: "+totalPairs);
    }
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,10};
        printSubArray(arr);
    }
}
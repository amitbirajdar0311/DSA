public class DistinctElementInArray {
    public static boolean containsDuplicate(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i] == arr[j]){
                    return true;
                }
            }
        }
        return false;
    }

   
    //approach 2 using hash set 
    // public static boolean containsDuplicate2(int[] arr){
    //     Set<Integer> set = new HashSet<>();
    //     for(int i=0;i<arr.length;i++){
    //         if(set.contains(arr[i])){
    //             return true;
    //         }
    //         set.add(arr[i]);
    //     }
    //     return false;
    // }
   
    public static void main(String[] args) {
     int[] arr = {1,2,3,1};
     boolean containsDuplicate = containsDuplicate(arr);
    System.out.println("Contains Duplicate: "+containsDuplicate);
     
    }
}

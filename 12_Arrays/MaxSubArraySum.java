// Source: https://www.youtube.com/watch?v=ohHWQf1HDfU&list=PLU_sdQYzUj2keVENTP0a5rdykRSgg9Wp-&index=6
public class MaxSubArraySum {
    public static void maxSubArraySumBruteForce(int[] arr){
        int maxsum = Integer.MIN_VALUE;
        int minsum = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                int sum = 0;
                for(int k=i;k<=j;k++){
                    sum +=arr[k];
                }
                maxsum = Math.max(maxsum, sum);
                minsum = Math.min(minsum, sum);
            }
        }

        System.out.println("Max Sum: "+maxsum);
        System.out.println("Min Sum: "+minsum);
    }

    public static void maxSubArraySumByPrefixSum(int[] arr){
        int[] prefix = new int[arr.length];
        prefix[0] = arr[0];
        for(int i=1;i<arr.length;i++){
            prefix[i] = prefix[i-1] + arr[i];
        }
        int maxsum = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j= i;j<arr.length;j++){
                int currentsum = 0;
                currentsum = i==0? prefix[j] : prefix[j] - prefix[i-1];
                maxsum = Math.max(maxsum, currentsum);

            }
        }
        System.out.println("Max Sum: "+maxsum);
    }

    public static void maxSubArraySumByKadanesAlgo(int[] arr){
        int max = Integer.MIN_VALUE;

        int cs = 0;
        for(int i=0;i<arr.length;i++){
            cs += arr[i];
            //for corner case all numbers to be neagative we calculate our max first .  
            max = Math.max(max, cs);
            if(cs<0){
                cs = 0;
            }
        }
        System.out.println("Max Sum: "+max);

    }
    public static void main(String[] args) {
        // int[] arr = {2,4,6,8,10};
        // int[] arr = {1,-2,6,-1,3};
        int[] arr = {-1,-2,-3,-4};
        // maxSubArraySumBruteForce(arr);
        // maxSubArraySumByPrefixSum(arr);
        maxSubArraySumByKadanesAlgo(arr);

    }    
}

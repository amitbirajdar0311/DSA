
public class SumOf1toN {
    //using loop
    public static int sumOf1toNUsingLoop(int n){
        int sum = 0;
        for(int i=1;i<=n;i++){
            sum+=i;
        }
        return sum;
    }
    //using Recursion
    public static int sumof1toNUsingRecursion(int n){
        //base case 
        if(n==1){
            return 1;
        }
        return n+sumof1toNUsingRecursion(n-1);
    }
    public static void main(String[] args){
        int n = 10;
        // int sum = sumOf1toNUsingLoop(n);
        int sum = sumof1toNUsingRecursion(n);
        System.out.println("Sum = " + sum);
    }    
}

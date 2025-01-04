import java.util.Scanner;
public class PrintAllPrimeNumbersInRange {
    public static boolean isPrime(int n) {
        if(n<=1){
            return false;
        }
        else if(n==2){
            return true;
        }
        else if(n%2==0){
            return false;
        }
        else{
            for(int i=3;i<=Math.sqrt(n);i+=2){
                if(n%i==0){
                    return false;
                }
            }
        }
        return true;
    }
    public static void printAllPrimeNumbersInRange(int lowerBound, int upperBound){
        int count =0;
        for(int i=lowerBound;i<=upperBound;i++){
            if(isPrime(i)){
                System.out.print(i + " ");
                count++;
            }
        }

        System.out.println("\nTotal prime numbers between " + lowerBound + " and " + upperBound + " are: " + count);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the lower bound: ");
        int lowerBound = sc.nextInt();
        System.out.print("Enter the upper bound: ");
        int upperBound = sc.nextInt();
        printAllPrimeNumbersInRange(lowerBound, upperBound);
        sc.close();
    }
}

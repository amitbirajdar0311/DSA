import java.util.Scanner;
public class PrintPrimeNumberbetweenAAndB {
    public static void printPrimeNumbersBetweenNum1AndNum2(int num1, int num2){
        int count = 0;
        for(int i=num1;i<=num2;i++){
            if(isPrime(i)){
                System.out.print(i+" ");
                count++;
            }
        }
        System.out.println(count);
    }

    public static boolean isPrime(int n){
        boolean isPrime = true;
        if(n<=1){
            isPrime = false;
        }
        else if(n==2){
            isPrime = true;
        }
        else if(n%2==0){
            isPrime = false;
        }
        else{
            for(int i=3;i<n;i+=2){
                if(n%i==0){
                    isPrime = false;
                }
            }
        }
        return isPrime;
       
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int num1 = sc.nextInt();
        System.out.println("Enter second number: ");
        int num2 = sc.nextInt();
        printPrimeNumbersBetweenNum1AndNum2(num1,num2);
        sc.close();
    }
}

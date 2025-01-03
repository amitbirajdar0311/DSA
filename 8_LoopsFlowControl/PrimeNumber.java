import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check it is prime or not ");
        int number  = sc.nextInt();
        boolean isPrime = true;
        if(number <=1){
            isPrime = false;
        }
        else if(number == 2){
            isPrime = true;
        }
        else {
            for(int i = 3; i < Math.sqrt(number); i+=2){
                if(number %i ==0){
                    isPrime = false;
                }
            }
        }

        if(isPrime)
            System.out.println("given number is prime");
        else 
            System.out.println("given number is not a prime number");
        sc.close();
    }
}

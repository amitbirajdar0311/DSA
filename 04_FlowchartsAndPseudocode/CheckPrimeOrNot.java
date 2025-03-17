import java.util.Scanner;
public class CheckPrimeOrNot{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check it is prime or not");
        int num = sc.nextInt();
        boolean isPrime = true;
        if(num <= 1){
            isPrime = false;
        }
        else if(num == 2){
            isPrime = true;
        }
        else if(num %2 ==0){
            isPrime = false;
        }
        else{
            for(int i=3;i<num;i+=2){
                if(num %i ==0){
                    isPrime = false;
                }
            }
        }

        if(isPrime){
            System.out.println("given number is Prime");
        }else{
            System.out.println("given numbrer is not a prime number");
        }
        sc.close();
    }
}
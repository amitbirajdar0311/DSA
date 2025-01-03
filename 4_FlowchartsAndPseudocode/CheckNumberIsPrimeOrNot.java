import java.util.Scanner;
public class CheckNumberIsPrimeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        boolean isPrime = true;
        if(num <= 1){
            isPrime = false;
        }
        else if(num == 2){
            isPrime = true;
        }
        else if(num % 2 == 0){
            isPrime = false;
        }
        else{
            for(int i = 3; i <= Math.sqrt(num); i += 2){
                if(num % i == 0){
                    isPrime = false;
                    break;
                }
            }
        }
    }
}

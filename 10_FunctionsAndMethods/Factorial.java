import java.util.Scanner;
public class Factorial {
    public static int factorial(int n){
        int fact = 1;
        for(int i=1;i<=n;i++){
            fact *=i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int factorial = factorial(n);
        System.out.println("The factorial of " + n + " is: " + factorial);
        sc.close();
    }
}

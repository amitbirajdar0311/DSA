import java.util.Scanner;
public class BinomialCoefficient {
    //using inbuilt factorial function
    // public static int binomialCoefficient(int n, int r) {
    //     return Factorial.factorial(n) / (Factorial.factorial(r) * Factorial.factorial(n - r));
    // }


    //using our own factorial function
    public static int binomialCoefficient(int n, int r){
        return fact(n) / (fact(r) * fact(n - r));
    }
    public static int fact(int n){
        int fact = 1;
        for(int i=1;i<=n;i++){
            fact *= i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        System.out.print("Enter the value of r: ");
        int r = sc.nextInt();
        int nCr = binomialCoefficient(n, r);
        System.out.println("The binomial coefficient of " + n + " and " + r + " is: " + nCr);
        // System.out.println(Factorial.factorial(5));
        sc.close();
    }
}

import java.util.Scanner;
public class ProductOfAB{
    public static int product(int a, int b){
        return a * b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a: ");
        int a = sc.nextInt();
        System.out.println("Enter the value of b: ");
        int b = sc.nextInt();
        int product = product(a, b);
        System.out.println("The product of a and b is: " + product);
        sc.close();  // Closing the scanner object to avoid resource leakage.  
    }
}
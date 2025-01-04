import java.util.Scanner;
public class SumOfDigitsInInteger {
    public static int sumOfDigitsInInteger(int num){
        int sum = 0;
        while(num > 0){
            int remainder = num % 10;
            sum += remainder;
            num = num / 10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int sum = sumOfDigitsInInteger(num);
        System.out.println("Sum of digits in the given number: " + sum);
        sc.close();
    }
}

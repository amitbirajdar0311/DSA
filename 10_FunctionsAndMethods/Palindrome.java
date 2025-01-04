import java.util.Scanner;
public class Palindrome {
    public static boolean isPalindrome(int num){
        int originalNum = num;
        int reversedNum = 0;
        while(num > 0){
            int remainder = num % 10;
            reversedNum = reversedNum * 10 + remainder;
            num = num / 10;
        }
        return originalNum == reversedNum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        boolean isPalindrome = isPalindrome(num);
        if(isPalindrome){
            System.out.println("The number is a palindrome.");
        }else{
            System.out.println("The number is not a palindrome.");
        }
        sc.close();
    }
}

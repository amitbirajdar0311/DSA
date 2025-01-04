import java.util.Scanner;
public class BinaryToDecimal{
    public static int binaryToDecimal(int binary) {
        int decimal = 0;
        int pow = 0;
        while(binary > 0){
            int rem = binary % 10;
            decimal += rem * Math.pow(2,pow);
            pow++;
            binary /= 10;
        }
        return decimal;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        int binary = sc.nextInt();
        int decimal = binaryToDecimal(binary);
        System.out.println("The decimal equivalent of " + binary + " is: " + decimal);
        sc.close();
    }
}
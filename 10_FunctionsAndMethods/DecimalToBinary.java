import java.util.Scanner;
public class DecimalToBinary {
    public static int decimalToBinary(int decimal){
        int binary = 0;
        int pow = 0;
        while(decimal > 0){
            int rem = decimal %2; 
            binary += rem * Math.pow(10, pow);
            pow++;
            decimal /= 2;
        }
        return binary;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimal = sc.nextInt();
        int binary = decimalToBinary(decimal);
        System.out.println("The binary equivalent of " + decimal + " is: " + binary);
        sc.close();
    }
}

import java.util.Scanner;
public class CheckGivenNumberIsEvenOrNot {
    public static boolean isEven(int num){
       return num%2 == 0 ? true : false;
    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter a number: ");
        boolean isEvenOrNot = isEven(sc.nextInt());
        if(isEvenOrNot){
            System.out.println("The number is even.");
        }else{
            System.out.println("The number is odd.");
        }

        sc.close();
    }
}

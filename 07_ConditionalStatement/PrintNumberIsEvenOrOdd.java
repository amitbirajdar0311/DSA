import java.util.Scanner;
public class PrintNumberIsEvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check it is even or odd !!");
        int number = sc.nextInt();
        if(number %2 ==0){
            System.out.println("Given number is even");
        }
        else{
            System.out.println("Given number is Odd ");
        }
        sc.close();
    }
}

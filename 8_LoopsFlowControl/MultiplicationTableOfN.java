import java.util.Scanner;
public class MultiplicationTableOfN {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number for which you want multiplication table : ");
        int num = sc.nextInt();

        for(int i=1;i<=10;i++){
            System.out.println(num + " * " + i + " = " + (num*i));
        }
        sc.close();
    }
}
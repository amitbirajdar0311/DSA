import java.util.Scanner;
public class CheckAStudentPassOrFail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks to check your are pass or fail : ");
        int marks = sc.nextInt();
        String reportcard = marks>=33?"pass":"fail";
        System.out.println(reportcard);
        sc.close();
    }
}

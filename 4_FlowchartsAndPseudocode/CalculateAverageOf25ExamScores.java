import java.util.Scanner;
public class CalculateAverageOf25ExamScores {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int sum = 0 ;
        for(int i=1;i<=25;i++){
            System.out.println("Enter Exam score : ");
            int score = sc.nextInt();
            sum += score;
        }
        int average = sum/25;
        System.out.println("Average of 25 exam score is : " + average);
        sc.close();
    }
}

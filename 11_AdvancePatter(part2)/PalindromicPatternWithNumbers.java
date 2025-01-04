public class PalindromicPatternWithNumbers {
    public static void main(String[] args) {
        int rows = 5;
        for(int i=1;i<=rows;i++){
            //for spaces 
            for(int j=1;j<=rows-i;j++){
                System.out.print(" ");
            }
            //for left side numbers  
            
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            // int count = i;
            // for(int j=1;j<=i;j++){
            //     System.out.print(count--);
              
            // }
            //for right side numbers 

            for(int j=2;j<=i;j++){
                System.out.print(j);
            }

            System.out.println();
        }
    }
}

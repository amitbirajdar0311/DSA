
public class Fibonicci {
    public static int fibonicci(int n){
        if(n == 1 || n==0){
            return n; 
        }
        return fibonicci(n-1) + fibonicci(n-2);

        
    }
    public static void main(String[] args){
        int n = 5;
        System.out.println(fibonicci(n));
    }    
}


public class ReverseANumber {
    public static void main(String[] args) {
        int n = 10899;
        int reversenumber = 0;
        while(n>0){
            int lastdigit = n%10; //9 9
            reversenumber = reversenumber * 10  + lastdigit; // 9 99
            n/=10;

        }
        System.out.println(reversenumber);
    }    
}

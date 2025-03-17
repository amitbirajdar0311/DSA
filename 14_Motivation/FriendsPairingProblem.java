
public class FriendsPairingProblem {
    public static int firendsPairing(int n){
       //base case  
        if(n==1 || n==2){
           return n; 
        }

        //kaam 
        int single = firendsPairing(n-1);

        //pair 
        int pair = firendsPairing(n-2); 
        //for single we have n-1 pairs to select. 
        int pairWays = (n-1)*pair;
        return single + pairWays;
       
    }
    public static void main(String[] args) {
        int n = 2;
       int sol =  firendsPairing(n);
       System.out.println(sol);
    }
}

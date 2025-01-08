public class Operations {

    // Function to get the ith bit of a number
    public static void getIthBit(int n, int i){
        int mask = 1 << i;
        System.out.println( (n&mask) ==0  ? "The " + i + "th bit is 0" : "The " + i + "th bit is 1");
    }

    // Function to set the ith bit of a number  
    public static void setIthBit(int n, int i){
        int mask = 1 << i;
        System.out.println("Number after setting the " + i + "th bit is " + (n | mask));
    }

    // Function to clear the ith bit of a number
    public static void clearIthBit(int n , int i){
        int mask = ~(1 << i);
        System.out.println("Number after clearing the " + i + "th bit is " + (n & mask));
    }

    // Function to update the ith bit of a number with a given value
    public static void updateIthBit(int n, int i, int val){
        // if(val == 1){
        //     setIthBit(n, i);
        // }else{
        //     clearIthBit(n, i);
        // }

        // Another way to do the same
        clearIthBit(n, i);
        int mask = val << i;    
        System.out.println("Number after updating the " + i + "th bit with value " + val + " is " + (n | mask));
    
    }
    public static void main(String[] args) {
        int n = 5; 
        //position of the bit to be checked
        int i = 2;
        //val is the value of the bit to be set at ith position 0 or 1
        int val = 0;
       getIthBit(n, i);
       setIthBit(n, i);
       clearIthBit(n, i);
       updateIthBit(n, i, val);
    }
    
}

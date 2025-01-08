public class ClearLastIthBit {
    public static int clearLastIthBit(int n, int i){
        int mask = ~0<<i;
        return n & mask;
    }
    public static void main(String[] args){
        int n = 15; //1111 in binary
        //clear last ith bit
        int i = 2;
       int updatedNumber = clearLastIthBit(n,i);
        System.out.println(updatedNumber);
    }
}

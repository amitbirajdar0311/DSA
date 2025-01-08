public class ClearRangeOfBits {
    public static int clearRangeOfBits(int n, int i, int j) {
        // Clearing bits from i to j inclusive
        //1<<i -1 means : 2^i -1 formula is crated and a<<b is a*2^b 
        int bitMask = ~0<<j+1 | (1<<i -1);
        return n & bitMask; 
    }
    public static void main(String[] args) {
        int n = 15; // 1111
        int i = 1;
        int j = 2; 
        int clearRange = clearRangeOfBits(n, i, j);
        System.out.println(clearRange);

    }
}

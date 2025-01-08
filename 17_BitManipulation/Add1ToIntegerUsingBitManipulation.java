public class Add1ToIntegerUsingBitManipulation {

    public static void main(String[] args) {
        int n = 3;
        // -x = ~x + 1 ;  replace x with ~x : ==>  x + 1 = - ~x;
        // - ~x = x + 1;
        System.out.println(-~n);
    }
}

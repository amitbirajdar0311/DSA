public class TrappedRainWater {
    public static int waterTrappedIs(int[] h){
        //for left boundary
        int[] leftmax = new int[h.length];
        leftmax[0] = h[0];
        for(int i=1;i<h.length;i++){
            leftmax[i] = Math.max(h[i], leftmax[i-1]);
        }

        //for right boundary
        int[] rightmax = new int[h.length];
        rightmax[h.length-1] = h[h.length-1];
        for(int i=h.length-2;i>=0;i--){
            rightmax[i] = Math.max(h[i], rightmax[i+1]);
        }
        int trappedWater = 0;
        for(int i=0;i<h.length;i++){
            int waterLevel = Math.min(leftmax[i], rightmax[i]);
            trappedWater += waterLevel - h[i];
        }
        return trappedWater;
    }
    public static void main(String[] args) {
        int[] h = {0,1,0,2,1,0,1,3,2,1,2,1};
        int waterTrapped = waterTrappedIs(h);
        System.out.println("Water Trapped: "+waterTrapped);
    }
}

public class TrappingRainwater {

  public static int trappedRainwater(int[] height, int width) {
    int trappedwater = 0;
    //left boundary
    int[] leftboundary = new int[height.length];
    leftboundary[0] = height[0];
    for (int i = 1; i < height.length; i++) {
      leftboundary[i] = Math.max(height[i], leftboundary[i - 1]);
    }
    //for right boundary
    int[] rightboundary = new int[height.length];
    rightboundary[height.length - 1] = height[height.length - 1];
    for (int i = height.length - 2; i >= 0; i--) {
      rightboundary[i] = Math.max(height[i], rightboundary[i + 1]);
    }
    //calculate trapped water
    for (int i = 0; i < height.length; i++) {
      int waterLevel = Math.min(leftboundary[i], rightboundary[i]);
      trappedwater += waterLevel - height[i];
    }

    return trappedwater;
  }

  public static void main(String[] args) {
    int[] height = { 4, 2, 0, 6, 3, 2, 5 };
    // int[] height = {4,2};

    //width of each bar is 1
    int width = 1;
    int trappedwater = trappedRainwater(height, width);
    System.out.println("Trapped Rainwater: " + trappedwater);
  }
}

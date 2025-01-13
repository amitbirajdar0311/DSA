public class TilingProblem {

  public static int totalNumberOfWaysToFillTiles(int n) { // 2 * n (floor size)
    //base case when number of tiles = 0 or 1 we have only 1 ways to fill tiles
    if (n == 0 || n == 1) {
      return 1;
    }

    //kam
    //vertical choice
    //since we can only place tiles vertically and horizontally
    //we subtract 1 from n and calculate the number of ways to fill remaining tiles (n - 1)
    //then add the number of ways to fill remaining tiles (n - 2) to get the total number of ways to fill tiles n

    //calculate the total number of ways to fill tiles for n - 1 and n - 2
    int verticalChoice = totalNumberOfWaysToFillTiles(n - 1);
    //horizontal choice

    int horizontalChoice = totalNumberOfWaysToFillTiles(n - 2);

    //return the sum of all possible ways
    int totalways = verticalChoice + horizontalChoice;
    return totalways;
  }

  public static void main(String[] args) {
    int length = 3; // length of the floor in tiles (2 * length)
    int ways = totalNumberOfWaysToFillTiles(length);
    System.out.println("Number of ways to fill tiles = " + ways);
  }
}

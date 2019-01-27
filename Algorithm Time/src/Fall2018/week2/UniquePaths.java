package Fall2018.week2;

import java.util.Arrays;
import java.util.HashMap;

public class UniquePaths {
    public static void main(String[] args) {
        new UniquePaths().run();
    }

    private void run() {
        int[][] arr = {{0,0,0},{0,1,0},{0,0,0}};
        System.out.println(uniquePathsWithObstacles(arr));
    }

    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int height = obstacleGrid.length;
        int width = obstacleGrid[0].length;
        int x = width - 1;
        int y = height - 1;
        int numberOfPaths = 0;
        if (x == 0 && y == 0){
            return 0;
        }
        if (x == 1 && y == 1){
            if (obstacleGrid[x - 1][y] == 0){
                numberOfPaths += 1;
            }
            if (obstacleGrid[x][y - 1] == 0){
                numberOfPaths += 1;
            }
        }
        if (obstacleGrid[x - 1][y] == 0){
            numberOfPaths += uniquePathsWithObstacles(copyArray(obstacleGrid,x - 1, y));
        }
        if (obstacleGrid[x][y - 1] == 0){
            numberOfPaths += uniquePathsWithObstacles(copyArray(obstacleGrid,x, y - 1));
        }
        return numberOfPaths;
    }

    private int[][] copyArray(int[][] originalArray, int x, int y){
        int [][] myInt = new int[x + 1][];
        for(int i = 0; i < x + 1; i++)
        {
            int[] aMatrix = originalArray[i];
            myInt[i] = new int[y + 1];
            System.arraycopy(aMatrix, 0, myInt[i], 0, y + 1);
        }
        return myInt;
    }
}

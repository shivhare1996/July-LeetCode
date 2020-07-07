package Day7;

/**
 * Date 07/07/2020
 * @author Aman Shivhare
 *
 * Source: https://leetcode.com/problems/island-perimeter/
 *
 */

public class Solution1 {
    public int islandPerimeter(int[][] grid) {
        int height = grid.length;
        int breadth = grid[0].length;
        int ans = 0;

        for(int i = 0; i<height; i++){
            for(int j = 0; j<breadth; j++){
                if(grid[i][j] == 1){
                    ans+=4;
                    if(i-1 >= 0 && grid[i-1][j] == 1){
                        ans--;
                    }
                    if(i+1 < height && grid[i+1][j] == 1){
                        ans--;
                    }
                    if(j-1 >=0 && grid[i][j-1] == 1){
                        ans--;
                    }
                    if(j+1< breadth && grid[i][j+1] == 1){
                        ans--;
                    }
                }

            }
        }

        return ans;

    }
}

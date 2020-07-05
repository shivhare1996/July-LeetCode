package Day5;

/**
 * Date 05/07/2020
 * @author Aman Shivhare
 *
 * Source: https://leetcode.com/problems/hamming-distance/
 *
 */

public class Solution1 {
    public int hammingDistance(int x, int y) {
        return countOne(x^y);
    }

    public int countOne(int x){
        int count = 0;
        while(x>0){
            count += (1&x) ;
            x = x >>1;
        }
        return count;
    }
}

package Day4;

/**
 * Date 04/07/2020
 * @author Aman Shivhare
 *
 * Source: https://leetcode.com/problems/ugly-number-ii/
 *
 */

public class Solution1 {
    public int nthUglyNumber(int n) {
        if( n ==0 || n == 1)
            return n;

        int count = 0;
        int i;
        for( i = 1;; i++){
            if(isUgly(i)){
                count++;
            }
            if(count == n){
                break;
            }
        }

        return i;
    }

    public boolean isUgly(int n){
        if(n == 0)
            return false;

        if(n == 1)
            return true;

        while(n%2 == 0){
            n = n/2;
        }
        while(n%3 == 0){
            n = n/3;
        }
        while(n%5 == 0){
            n = n/5;
        }

        return (n == 1);
    }
}

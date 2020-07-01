package com.algorithm.interview.day1;

/**
 * Date 01/07/2020
 * @author Aman Shivhare
 *
 * Source: https://leetcode.com/problems/arranging-coins/
 *
 */
public class Solution3 {

    public int arrangeCoins(int n) {
        return (int) ((-1 + Math.sqrt(1+ 8*(long)n))/2);
    }

}

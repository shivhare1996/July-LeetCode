package com.algorithm.interview.day1;

/**
 * Date 01/07/2020
 * @author Aman Shivhare
 *
 * Source: https://leetcode.com/problems/arranging-coins/
 *
 */
public class Solution1 {
    public int arrangeCoins(int n) {
        int copy = n;
        int i =0;
        for( i =0; i<=copy; i++){
            if(n<i){
                break;
            }
            n = n-i;
        }
        return i-1;
    }
}

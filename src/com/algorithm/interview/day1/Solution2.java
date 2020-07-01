package com.algorithm.interview.day1;

/**
 * Date 01/07/2020
 * @author Aman Shivhare
 *
 * Source: https://leetcode.com/problems/arranging-coins/
 *
 */
public class Solution2 {
    public int arrangeCoins(int n) {
        int left =0 ;
        int right = n;
        int mid = 0;
        long ans = 0;

        while(left<=right){
            mid = (left + right)/2;
            ans = (mid* ((long)mid+1))/2 ;
            if ( ans == n){
                return mid;
            }
            if( ans < n){
                left = mid+1;
            }else{
                right = mid-1;
            }

        }
        return right;
    }
}

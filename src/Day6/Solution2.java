package Day6;

/**
 * Date 06/07/2020
 * @author Aman Shivhare
 *
 * Source: https://leetcode.com/problems/plus-one/
 *
 */

public class Solution2 {
    public int[] plusOne(int[] digits) {

        int n= digits.length;
        int sum = digits[n-1]+1;
        int carry = sum/10;
        digits[n-1] = sum%10;

        for(int i = n-2; carry != 0 && i>=0; i--){
            sum = digits[i] + carry;
            digits[i] = (sum%10);
            carry = (sum/10);
        }

        if(carry == 0)
            return digits;
        else{
            int[] ans = new int[n+1];
            ans[0] = carry;
            for(int i =0; i<n; i++){
                ans[i+1] = digits[i];
            }
            return ans;
        }

    }
}

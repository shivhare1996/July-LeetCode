package Day6;

/**
 * Date 06/07/2020
 * @author Aman Shivhare
 *
 * Source: https://leetcode.com/problems/plus-one/
 *
 */

public class Solution1 {
    public int[] plusOne(int[] digits) {

        int n= digits.length;
        int carry = 0;
        int sum;

        for(int i = n-1; i>=0; i--){
            if(i == n- 1){
                sum = digits[i] + 1 + carry;
            }else{
                sum = digits[i] + carry;
            }
            digits[i] = (sum%10);
            carry = (sum/10);
        }

        if(carry == 0)
            return digits;
        else{
            int[] ans = new int[n+1];
            ans[0] = carry;
            System.arraycopy(digits, 0, ans, 1, n);
            return ans;
        }

    }
}

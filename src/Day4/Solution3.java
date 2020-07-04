package Day4;

/**
 * Date 04/07/2020
 * @author Aman Shivhare
 *
 * Source: https://leetcode.com/problems/ugly-number-ii/
 *
 */

public class Solution3 {
    public int nthUglyNumber(int n) {

        int arr[] = new int[n];

        arr[0] =1;
        int m2 = 0;
        int m3 = 0;
        int m5 = 0;

        for(int i =1; i<n; i++){
            arr[i] = Math.min(Math.min(arr[m2]*2, arr[m3]*3), arr[m5]*5);

            if(arr[i] == arr[m2]*2){
                m2++;
            }
            if(arr[i] == arr[m3]*3){
                m3++;
            }
            if(arr[i] == arr[m5]*5){
                m5++;
            }

        }

        return arr[n-1];
    }
}

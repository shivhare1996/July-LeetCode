package Day8;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Date 08/07/2020
 * @author Aman Shivhare
 *
 * Source: https://leetcode.com/problems/3sum/
 *
 */

public class Solution3 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);

        for(int i = 0; i< nums.length; i++){
            int start = i+1;
            int end = nums.length -1;

            if(i !=0 && nums[i-1] == nums[i]){
                continue;
            }

            while(start<end){
                if(nums[start] + nums[end] + nums[i] == 0){
                    ans.add(Arrays.asList(nums[i], nums[start], nums[end]));
                    while(start<end && nums[start+1] == nums[start]) start++;
                    end--;
                    start++;
                }else if(nums[start] + nums[end] + nums[i]>0){
                    end--;
                }else {
                    start++;
                }

            }
        }

        return ans;
    }
}

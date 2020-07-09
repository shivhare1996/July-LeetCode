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

public class Solution1 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();

        Arrays.sort(nums);

        for (int i = 0; i < nums.length; ++i) {
            if (i != 0 && nums[i] == nums[i - 1]) continue;

            for (int j = i + 1; j < nums.length; ++j) {
                if (j != i + 1 && nums[j] == nums[j - 1]) continue;

                for (int k = j + 1; k < nums.length; ++k) {
                    if (k != j + 1 && nums[k] == nums[k - 1]) continue;

                    if(nums[i] + nums[j] + nums[k] == 0 ){
                        ans.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    }
                }
            }
        }

        return ans;
    }

}

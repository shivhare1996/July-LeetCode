package Day8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Date 08/07/2020
 * @author Aman Shivhare
 *
 * Source: https://leetcode.com/problems/3sum/
 *
 */

public class Solution2 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);

        for(int i = 0; i< nums.length; i++){

            if(i !=0 && nums[i-1] == nums[i]){
                continue;
            }

            Set<Integer> set = new HashSet<>();

            for(int j = i+1; j<nums.length; j++){

                if(set.contains(-nums[i] - nums[j])){
                    ans.add(Arrays.asList(nums[i], nums[j], -nums[i]-nums[j]));
                    while(j!=nums.length-1 && nums[j+1] == nums[j])
                        j++;
                }

                set.add(nums[j]);
            }

        }

        return ans;
    }

}

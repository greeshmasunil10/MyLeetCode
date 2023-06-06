/*
 * @lc app=leetcode id=1 lang=java
 *
 * [1] Two Sum
 */

// @lc code=start

import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            if(map.containsKey(target - nums[i])){
                return new int[]{map.get(target-nums[i]), i};
            }
            map.put(nums[i],i);
        }

        return null;
    }
}
// @lc code=end

// Accepted
// 57/57 cases passed (2 ms)
// Your runtime beats 80.63 % of java submissions
// Your memory usage beats 33.87 % of java submissions (43.7 MB)
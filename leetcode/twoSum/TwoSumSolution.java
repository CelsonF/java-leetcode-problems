package leetcode.twoSum;

import java.util.Map;
import java.util.HashMap;

public class TwoSumSolution {
    /**
     * Finds two indices in the array such that their values sum to the target.
     *
     * @param nums   the array of integers
     * @param target the target sum
     * @return an array containing the two indices, or {-1, -1} if no such indices
     *         exist
     */
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }

        return new int[] { -1, -1 };
    }

    /**
     * Optimized version of the twoSum method using a HashMap to reduce time
     * complexity.
     *
     * @param nums   the array of integers
     * @param target the target sum
     * @return an array containing the two indices, or {-1, -1} if no such indices
     *         exist
     */
    public int[] twoSumOptimized(int[] nums, int target) {
        Map<Integer, Integer> numToIndex = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            
            if (numToIndex.containsKey(complement)) {
                return new int[] { 
                    numToIndex.get(complement), i 
                };
            }
            
            numToIndex.put(nums[i], i);
        }

        return new int[] { -1, -1 };
    }
}

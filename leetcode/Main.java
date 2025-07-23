package leetcode;

import leetcode.twoSum.Solution;

public class Main {
    public static void main(String[] args) {
        Solution twoSum = new Solution();
        int[] nums = {2, 7, 11, 15, 3, 6, 8, 4, 5};
        int target = 12;
        int[] result = twoSum.twoSum(nums, target);
        
        if (result[0] != -1) {
            System.out.println("Indices found: " + result[0] + ", " + result[1]);
        } else {
            System.out.println("No indices found that sum to the target.");
        }


        // Example of using the optimized method 
        int[] optimizedResult = twoSum.twoSumOptimized(nums,target);
        if (optimizedResult[0] != -1) {
            System.out.println("Optimized indices found: " + optimizedResult[0] + ", " + optimizedResult[1]);
        } else {
            System.out.println("No indices found that sum to the target in optimized method.");
        }
    }
}

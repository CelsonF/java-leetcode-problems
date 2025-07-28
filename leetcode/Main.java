package leetcode;

import leetcode.twoSum.TwoSumSolution;

import java.util.List;

import leetcode.letterCombinations.LetterCombinationsSolution;
import leetcode.numberOfBits.HammingWeightSolution;

public class Main {
    public static void main(String[] args) {

        // Example of using the TwoSumSolution class from twoSum package
        TwoSumSolution twoSum = new TwoSumSolution();
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


        // Example of using the hammingWeight method from Solution class in numberOfBits package
        
        // Convert a number to its binary representation
        int numberInBinary = 10000000;
        
        HammingWeightSolution hammingWeightSolution = new HammingWeightSolution();
        int hammingWeight = hammingWeightSolution.hammingWeight(numberInBinary);

        System.out.println("Number of '1' bits in " + numberInBinary + " is: " + hammingWeight);


        // Example of using the LetterCombinationsSolution class from letterCombinations package
        LetterCombinationsSolution letterCombinationsSolution = new LetterCombinationsSolution();
        List<String> comboList = letterCombinationsSolution.letterCombinations("23");
        
        System.out.println("Letter combinations for '23': " + comboList);

    }
}

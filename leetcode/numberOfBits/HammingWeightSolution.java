package leetcode.numberOfBits;


/**
 * Solution class to count the number of '1' bits in the binary representation of an integer.
 * This spacial complexity is O(1) and time complexity is O(n) where n is the input integer.
 * 
 */

public class HammingWeightSolution {
    
    /**
     * Counts the number of '1' bits in the binary representation of an integer.
     *
     * @param n the integer to count bits for
     * @return the number of '1' bits in the binary representation of n
     */
    public int hammingWeight(int n) {
        int count = 0;
        while(n != 0) {
            count += n & 1;
            n >>>= 1;
        }

        return count;
    }
}

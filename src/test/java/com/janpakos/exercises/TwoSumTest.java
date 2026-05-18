package com.janpakos.exercises;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {

    private final TwoSum twoSum = new TwoSum();

    @Test
    void testBasicTwoSum() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] expected = {0, 1};
        int[] result = twoSum.findTwoSum(nums, target);
        
        assertArrayEquals(expected, result);
    }

    @Test
    void testTwoSumWithDuplicates() {
        int[] nums = {3, 3};
        int target = 6;
        int[] expected = {0, 1};
        int[] result = twoSum.findTwoSum(nums, target);
        
        assertArrayEquals(expected, result);
    }

    @Test
    void testTwoSumNoOrder() {
        int[] nums = {3, 2, 4};
        int target = 6;
        int[] result = twoSum.findTwoSum(nums, target);
        
        // Either {1, 2} or {2, 1} is acceptable
        assertTrue((result[0] == 1 && result[1] == 2) || (result[0] == 2 && result[1] == 1));
    }
}

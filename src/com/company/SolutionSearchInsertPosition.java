package com.company;

public class SolutionSearchInsertPosition {

    public int searchInsert(int[] nums, int target) {

        // We are asked to write an algorithm with
        // O (log n) runtime complexity. Not simply
        // the brute force solution that would iterate
        // through the entire array each time.
        // USE BINARY SEARCH ALGORITHM

        // Use l and r for left and right side pointers


        int l = 0;
        int r = nums.length - 1;

        while (l <= r) {
            int midIndex = (l + r)/2;
            if (nums[midIndex] == target) {
                return midIndex;
            } else if (nums[midIndex] > target) {
                r = midIndex - 1;
            } else {
                l = midIndex + 1;
            }
        }
        return l;

    }
}

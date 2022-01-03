package com.company;

public class SolutionMaxConsecutiveOnesIII {

    public int longestOnes(int[] nums, int k) {
        // Sliding Window problem with two pointers
        // points (i & j) move along and j will decrement
        // int k every time we encounter a zero. When that
        // happens we will count how many items are in the
        // array and save a max value. So every time j moves
        // we'll need to count up the elements.

        // first, set up pointers
        int i = 0;
        int j = 0;

        // set up movement of i through the list, it should
        // traverse from start to finish without stopping.
        // i pointer gets to the end of the array while j
        // stays to the left of the window in the array
        while (i < nums.length) {

            // when i runs into a zero it decrements our
            // counter (k)
            if (nums[i] == 0) k--;

            // so if k becomes negative we need to increment
            // j and move it to the right on the array
            // we also need to increment k when the number on
            // the left of the window is a zero
            if ( k < 0) {
                if (nums[j] == 0) {
                    k++;
                }
                j++;
            }
            i++;
        }
        // this return gives you the length of the array
        // covered by i (on the right) & j (on the left)
        return i - j;


    }
}

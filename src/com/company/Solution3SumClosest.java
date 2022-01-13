import java.util.Arrays;

package com.company;

// The first step in this problem is to sort the array.
// You do this so that you can use two pointers to traverse
// the array with two pointers. One pointer starting from each
// end of the newly sorted array.

public class Solution3SumClosest {

    public int threeSumClosest(int [] nums, int target) {

        // obviously we need a variable to store our results in
        // so they can be compared to the target. Result stores
        // the first total. You will use this to compare each
        // time through the loop and if currentSum is closer
        // to target, you will update and eventually return
        // the closest result to target.

        int result = nums[0] + nums[1] + nums[nums.length -1];

        // time to sort the array

        Arrays.sort(nums);

        // now we'll need to set up a loop to go through the
        // array and begin to calculate. Remember that the loop
        // needs to stop at nums.length-2 so it doesn't go OOB.

        for(int i = 0; i < nums.length - 2; i ++) {
            // now create the two pointers that will count up/down
            // aPointer will be the number just ahead of i in the
            // array, and bPointer will be the last number in the array
            int aPointer = i + 1;
            int bPointer = nums.length - 1;

            // now set up to make sure that a is always less than b.
            while(aPointer < bPointer) {
                int currentSum = nums[i] + nums[aPointer] + nums[bPointer];

                // since the array has been sorted we can see that if the
                // currentSum is too high or low we will move the corresponding
                // pointer to get closer to the target number

                if (currentSum > target) {
                    bPointer -= 1;
                } else {
                    aPointer += 1;
                }

                if(Math.abs(currentSum - target) < Math.abs(result - target)) {
                    result = currentSum;
                }
            }
        }

        // once you complete the loop you return the final result that is now the
        // closest to the target
        return result;

    }
}

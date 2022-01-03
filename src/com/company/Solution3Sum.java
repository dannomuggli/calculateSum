package com.company;

import java.util.*;

public class Solution3Sum {

    // You need to import List and Array to solve this.
    // first thing to do is to sort the array
    // this is similar to the twoSum method since you
    // will be iterating from the front and back of
    // the array. You want to use [i] starting from the
    //  zero position and then find two numbers within the
    // array that, when added together, give you the
    // target result. In this case the result = 0.

    // Since you are returning 3 numbers, you'll want a
    // list of integers to return them. ALSO, since there
    // may be multiple combinations of numbers that are
    // correct results, you'll have a list of lists.

    public List<List<Integer>> threeSum(int[] nums) {

        // make sure the first step is to sort the arrays
        Arrays.sort(nums);

        // declare your list of lists as an output array
        // REMEMBER: list of lists since there may be
        // multiple correct options
        List<List<Integer>> result_array = new LinkedList();

        // use nums.length -2 because you need 3 numbers
        // in your results array, so the last number
        // you would look at is the third one from the
        // end of the list to avoid going out of bounds
        for (int i = 0; i < nums.length -2; i++) {

            // We find the first element in the loop
            // then we compare to make sure there are
            // no duplicates
            if (i == 0 || (i > 0 && nums[i] != nums[i - 1])) {
                int low_end  = i + 1;
                int high_end = nums.length - 1;
                int sum = 0 - nums[i];

                while (low_end < high_end) {
                    if (nums[low_end] + nums[high_end] == sum) {
                        result_array.add(Arrays.asList(nums[i], nums[low_end], nums[high_end]));
                        while (low_end < high_end && nums[low_end] == nums[low_end + 1]) low_end++;
                        while (low_end < high_end && nums[high_end] == nums[high_end - 1]) high_end--;
                        low_end++;
                        high_end--;
                    } else if (nums[low_end] + nums[high_end] > sum) {
                        high_end--;
                    } else {
                        low_end++;
                    }
                }
            }

        }

        return result_array;


    }
}

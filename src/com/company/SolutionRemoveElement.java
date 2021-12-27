package com.company;

public class SolutionRemoveElement {


    public int removeElement(int[] nums, int val) {

        // first check if nums.length is equal to zero
        // if so, return zero
        if(nums.length == 0)
            return 0;

        // next, loop through array and set each valid
        // element to the front of the array. Start with
        // int [j] equal to zero (first position in array)

        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[j] = nums[i];
                j++;
            }

        }
        return j;

    }
}

package com.company;

public class SolutionRemoveDuplicatesFromSortedArray {

    public int removeDuplicates(int[] nums) {
        int index = 0;

        // start out with your index at the first position (zero)
        // in the sorted array. When index equal zero the first
        // time through the array it will insert the value of i.
        // Then every subsequent time through the array index will
        // compare to the value from the prior time through the
        // array. As long as the current nums[i] doesn't equal
        // the value of the previous nums[index-1] it will be
        // appended to the array. So each time through you will
        // return a new value larger than the last.

        for (int i = 0; i < nums.length ; i++) {
            if(index ==0 || nums[index-1] != nums[i]){
                nums[index] = nums[i];
                index++;
            }
        }
        return index;

    }
}

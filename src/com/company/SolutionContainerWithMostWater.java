package com.company;

public class SolutionContainerWithMostWater {

    // First set up the maxArea that you will return
    // at the end of the problem.
    // Then set up two pointers to start at the ends
    // and meet in the middle. As they move closer
    // you will calculate the area of the resulting
    // container created. If it is bigger than any prior
    // instance it will replace maxArea.

    public int maxArea(int[] height) {
        int max_area = 0;
        // a_pointer starts at the beginning of the loop
        int a_pointer = 0;
        // b_pointer starts at the end of the loop
        int b_pointer = height.length - 1;

        // Now run a while loop with the condition that
        // the a_pointer stays less than b_pointer (within the array)
        // they can't cross or your area would be negative

        while (a_pointer < b_pointer) {

            // if the height of column a_pointer is less than
            // b_pointer column you'll run the calculation below
            // and then move a_pointer one slot and recalculate
            if (height[a_pointer] < height[b_pointer]) {

                // calculate the max area by taking the height of
                // the a_pointer multiplied by the difference in the
                // b & a pointers. Then you can increment the a_pointer
                // so you move to the next bar in the graph. then you
                // calculate the area and replace if you have a new max_area
                max_area = Math.max(max_area, height[a_pointer] * (b_pointer - a_pointer));
                a_pointer += 1;
            } else {

                // if b_pointer is <= to a_pointer you'll run this calculation
                // and then decrement b_pointer to the next column
                // this happens until a_pointer == b_pointer
                max_area = Math.max(max_area, height[b_pointer] * (b_pointer - a_pointer));
                b_pointer -= 1;
            }
        }
        // each time through the max_area is updated by the Math.max command
        // so the largest result will be returned on this line.
        return max_area;

    }
}

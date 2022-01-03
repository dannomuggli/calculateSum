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
        // the a_pointer stays less than b_pointer
        // they can cross or your area would be negative

        while (a_pointer < b_pointer) {
            if (height[a_pointer] < height[b_pointer]) {
                max_area = Math.max(max_area, height[a_pointer] * (b_pointer - a_pointer));
                a_pointer += 1;
            } else {
                max_area = Math.max(max_area, height[b_pointer] * (b_pointer - a_pointer));
                b_pointer -= 1;
            }
        }
        return max_area;

    }
}

package com.company;

public class SolutionFindTheCelebrity {

    // The Leetcode problem will have Line 4
    // "public class Solution extends Relation{}"
    // as the start of the code.

    // you are also given the boolean knows(a, b) which
    // tells you whether A knows B. Implements a function
    // int findCelebrity(n). There will be exactly one celebrity
    // if he/she is in the party. Return the celebrity's label
    // if there is a celebrity in the party. If there is no
    // celebrity return -1.

    // Your code will begin after that with:

    public int findCelebrity(int n) {
        int possible_celeb = 0;
        for (int i = 0; i < n; i++) {
            if (knows(possible_celeb, i)) possible_celeb = i;
        }
        if(isCeleb(possible_celeb, n))
            return possible_celeb;
        return -1;
    }
    private boolean isCeleb(int possible_celeb, int n) {
        for (int j = 0; j < n; j++) {
            if (possible_celeb == j) continue;
            if (knows(possible_celeb, j) || !knows(j, possible_celeb)) return false;
        }
        return true;
    }
}

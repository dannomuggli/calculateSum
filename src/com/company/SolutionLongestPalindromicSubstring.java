package com.company;

public class SolutionLongestPalindromicSubstring {

    // There are three basic cases we can encounter
    // "racecar"  - palindrome with one letter in pivot position
    // "aaabbaaa" - palindrome with even number of letters
    // "babad"    - palindrome that just appears in a window

    // Write the method "searchFromMidpoint" first

    public String longestPalindrome(String s) {

        // set up the base cases. If the string is empty
        // return nothing
        if (s == null || s.length() < 1)
            return "";

        // next set up your pointers to count out
        // from the middle of your string to compare
        // elements and verify if they are a palindrome

        int start = 0;
        int end   = 0;

        // len1 handles the case like racecar. Checking
        // from i and i means you start the pointer at
        // the same place and move out from there in
        // opposite directions.

        // len2 handles the aaabbaaa case. Starting at
        // i and i+1 then moving away from those points

        // len just figures out the max distance

        for (int i = 0; i < s.length(); i++) {
            int len1 = searchFromMidpoint(s, i, i);
            int len2 = searchFromMidpoint(s, i, i + 1);
            int len  = Math.max(len1, len2);
            if (len > end - start) {
                start = i - ((len - 1) / 2);
                end   = i + (len / 2);
            }

        }
        return s.substring(start, end +1);

    }
    // while the left side is greater than zero and the right side is
    // less than the total length (to avoid out of bounds) you'll
    // move to the left and the right ONLY if the characters match
    // The return value will be the positions of the elements at the
    // outer limits of the palindrome, then minus one since we start
    // with the zero position on left side.
    public int searchFromMidpoint(String s, int left, int right) {
        if (s == null || left > right)
            return 0;
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left --;
            right ++;
        }
        return right - left - 1;
    }
}

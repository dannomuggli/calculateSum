package com.company;

public class SolutionImplementStrStr {

    public int strStr(String haystack, String needle) {

        // first look at the base cases. If haystack or
        // needle are equal to null, we'll return -1.
        // if needle length is > haystack length we also
        // return -1.
        if (haystack == null || needle == null || needle.length() > haystack.length())
            return -1;

        // the problem states that if needle is an
        // empty string, we should return 0.
        if (needle.length() == 0)
            return 0;

        // iterate through the haystack, but we don't
        // need to iterate all the way through. If you
        // have 2 positions left in haystack and needle
        // is 3, you couldn't possibly find the needle
        // in that circumstance.
        for (int i = 0; i < haystack.length() - needle.length() + 1; i++) {
            if (haystack.charAt(i) == needle.charAt(0)) {

                // if you found an element that meets the
                // conditions at the first character, then
                // you can check the subsequent characters
                // by using the substring
                if (haystack.substring(i, needle.length() + i).equals(needle))
                    return i;
            }

        }
        // if neither of those find needle in haystack
        // return -1.
        return -1;

    }
}

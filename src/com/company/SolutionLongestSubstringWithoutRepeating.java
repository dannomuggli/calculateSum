package com.company;

import java.util.HashSet;

public class SolutionLongestSubstringWithoutRepeating {

    // using two pointers, start both at position 0.
    // One pointer moves up the string and each new
    // element is added to a hashmap. A counter tracks
    // how many elements are inside the "window", and
    // whenever a repeat element is added to the
    // hashmap it will drop off and recalculate to
    // see if we need to update our max counter.

    public int lengthOfLongestSubstring(String s) {

        // create pointers (i,j) and max counter
        int i_pointer  = 0;
        int j_pointer   = 0;
        int max = 0;

        // create hashset of characters
        HashSet<Character> hash_set = new HashSet();

        // when at the first position, you'll add the
        // character in that position since it's new to
        // the max counter. Then increment the j_pointer
        // since that one is the one expanding the window
        // then update the max with our new total
        while (j_pointer < s.length()) {
            if (!hash_set.contains(s.charAt(j_pointer))) {
                hash_set.add(s.charAt(j_pointer));
                j_pointer++;
                max = Math.max(hash_set.size(), max);

                // if we find a duplicate we need to
                // remove from the beginning of the
                // hash_set (i_pointer) and increment
                // to get i_pointer to the "new"
                // beginning of the hash_set
            } else {
                hash_set.remove(s.charAt(i_pointer));
                i_pointer++;
            }
        }
        return max;



    }
}

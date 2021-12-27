package com.company;

import java.util.HashMap;

public class SolutionRomanToInteger {
    public int romanToInt(String s) {
        // create hashmap and define characters and integers
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        // we need a running sum for the result, so create a sum
        int sum = 0;

        // loop through each string and address the 3 conditions
        // I placed before V or X equals 4 and 9
        // X placed before L or C equals 40 and 90
        // C placed before D or M equals 400 or 900
        for (int i = 0; i < s.length(); i++) {
            // I before V or X
            if (s.charAt(i) == 'V' || s.charAt(i) == 'X'){
                if (i > 0 && s.charAt(i-1) == 'I') sum -= 2;
            }
            // X before L or C
            if (s.charAt(i) == 'L' || s.charAt(i) == 'C'){
                if (i > 0 && s.charAt(i-1) == 'X') sum -= 20;
            }
            // C before D or M
            if (s.charAt(i) == 'D' || s.charAt(i) == 'M'){
                if (i > 0 && s.charAt(i-1) == 'C') sum -= 200;
            }
            sum += s.charAt(i);
        }
        return sum;


    }
}

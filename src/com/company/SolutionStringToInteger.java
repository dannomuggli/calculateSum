package com.company;

public class SolutionStringToInteger {

    public int myAtoi(String s) {

        // work out your base cases
        // if the string is empty or null return 0
        if(s == null || s.isEmpty())
            return 0;

        // Now define variables
        int sign = 1, i = 0, n = s.length();

        while (i < n && s.charAt(i) == ' ')
            ++i;
        if (i >= n)
            return 0;
        if (s.charAt(i) == '+' || s.charAt(i) == '-')
            sign = s.charAt(i++) == '+' ? 1 : -1;

        // Your data may contain large numbers so be prepared
        // to handle more than integers
        long result = 0;
        while (i < n && Character.isDigit(s.charAt(i))) {
            result = result * 10 + (s.charAt(i++) - '0');
            if (result * sign > Integer.MAX_VALUE || result * sign < Integer.MIN_VALUE)
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }
        return (int) (result * sign);

    }
}

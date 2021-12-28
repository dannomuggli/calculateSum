package com.company;

public class SolutionReverseInteger {

    // instead of using the brute force method of
    // turning the integers into a string and reversing it
    // check out the mathematical solution below. You can
    // % the integer (x) and you'll be left with the
    // remainder. That last digit becomes the first digit
    // Then as you go through the loop it moves each digit.
    // Use example integer 123
    //
    // lastDigit = 123 % 10 = 3
    // result = (0) * 10 + lastDigit (3) = 3
    // x (123) = 123 / 10 = 12
    // go through while loop again
    // lastDigit = 12 % 10 = 2
    // result = 3 * 10 + 2 = 32
    // x (12) = 12 / 10 = 1
    // Then once more through gets you the answer 321
    //
    //
    //
    // The question has max/min values, so be aware of that

    public int reverse(int x) {
        long result = 0;
        int lastDigit;

        while(x != 0) {
            lastDigit = x % 10;
            result = result * 10 + lastDigit;
            x = x / 10;

            if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
                return 0;
            }
        }

        return (int) result;

    }
}

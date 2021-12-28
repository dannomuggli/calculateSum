package com.company;

public class SolutionZigZagConversion {

    // PAYPAL IS HIRING. notice that the pattern
    // is "PAYP" then it repeats... "ALIS"... "HIRI"... "NG"
    // P   A   H   N
    //  A P L S I I G
    //   Y   I   R

    // We use a string builder to accomplish this and append
    // a character


    public String convert(String s, int numRows) {

        // Create StringBuilders to match numRows
        StringBuilder[] sb = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            sb[i] = new StringBuilder();
        }

        // Create variables for the StringBuilders
        char[] arr = s.toCharArray();
        int n = arr.length;
        int index = 0;

        // Move through the ZigZag form
        // move down while the index is less than
        // the length of the array
        // the sb[] appends the current character
        // onto the row its on as it moves down
        // until it gets to numRows
        while (index < n){
            for (int j = 0; j < numRows && index < n; j++) {
                sb[j].append(arr[index++]);
            }

            // Now moving up before starting again
            // the sb[j] appends the current character
            // onto the row its on while it moves
            // back up until numRows is at the end of
            // the loop section "PAYP".
            for (int j = numRows - 2;  j > 0 && index < n; j--) {
                sb[j].append(arr[index++]);
            }
        }

        // Combining the stringbuilders together in a loop
        // and print on one line. This gives the result
        // "PAHNAPLSIIGYIR"
        StringBuilder result = sb[0];
        for (int i = 1; i < numRows; i++) {
            result.append(sb[i].toString());
        }
        return result.toString();


    }
}

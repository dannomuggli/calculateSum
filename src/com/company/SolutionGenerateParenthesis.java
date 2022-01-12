package com.company;

import java.util.ArrayList;
import java.util.List;

public class SolutionGenerateParenthesis {

    public List<String> generateParenthesis(int n) {
        List<String> outputArray = new ArrayList();
        backtrack(outputArray, "", 0, 0, n);
        return outputArray;
    }

    public void backtrack(List<String> outputArray, String current_string, int open, int close, int max){

        if (current_string.length() == max * 2) {
            outputArray.add(current_string);
            return;
        }

        if (open < max) backtrack(outputArray, current_string + "(", open + 1, close, max);
        if (close < open) backtrack(outputArray, current_string + ")", open, close + 1, max);
    }
}

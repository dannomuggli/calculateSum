package com.company;

import java.util.Stack;

public class SolutionIsValidParentheses {
    public boolean isValid(String s) {

        // There must be an even number of braces for
        // each to be opened and then closed properly
        if (s.length() % 2 != 0)
            return false;

        // Create a stack to add different braces to
        // You can always add push braces to the stack
        // until you get to a closing brace, then you
        // need to peek the brace on the top of the
        // Stack to see if it matches. If so, you can
        // stack.pop the braces off.

        Stack<Character> stack = new Stack();
        for (char c : s.toCharArray()){
            if (c == ')' && !stack.isEmpty() && stack.peek() == '('){
                stack.pop();
            }  else if (c == '}' && !stack.isEmpty() && stack.peek() == '{'){
                stack.pop();
            }  else if (c == ']' && !stack.isEmpty() && stack.peek() == '['){
                stack.pop();
            }  else {
                stack.push(c);
            }
        }
        return stack.isEmpty();

    }
}

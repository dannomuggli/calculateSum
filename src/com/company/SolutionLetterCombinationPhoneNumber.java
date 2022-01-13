package com.company;
import java.util.LinkedList;
import java.util.List;

// The results are going to be output in a list
// so we need to import the List utility from
// the Java library. We'll need to put everything
// into a LinkedList and we'll call that resultsArray

public class SolutionLetterCombinationPhoneNumber {

    public List<String> letterCombinations(String digits) {
        LinkedList<String> resultArray = new LinkedList<>();

        // The base case is if the list we are given is empty
        // If so, the length is == 0 and we return an empty array
        if(digits.length() == 0) return resultArray;

        resultArray.add("");

        // Now we need to add in our strings that correspond with
        // the numbers on the keypad on the phone. REMEMBER: 0 and 1
        // Do not have any letters on them.

        String[] char_map = new String[] {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

        // Now set up a loop to go through any digits given
        // There is an empty string already (resultsArray) that
        // will accept each of the digits are you loop through
        // Now the loop will look at the characters in the char_map
        // and add them to the queue

        for (int i = 0; i < digits.length(); i++) {

            // this will give us access to the numeric value that
            // correlates with the char_map String above
            int index = Character.getNumericValue(digits.charAt(i));
            while (resultArray.peek().length() == i) {

                // everytime we encounter another digit we add to the
                // output (resultArray)
                String tempString = resultArray.remove();
                for (char c : char_map[index].toCharArray()) {

                    // so the first time through the array is empty
                    // the next time through it is also empty since
                    // zero and one don't have string values
                    // on the third time through the loop we encounter
                    // "abc" and these are added as individual strings
                    // "a", "b", "c".
                    resultArray.add(tempString + c);
                }
            }
        }
        return resultArray;
    }
}

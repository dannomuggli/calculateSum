package com.company;

public class SolutionPalindrome {

    public boolean isPalindrome(int x) {
        // base condition
        if (x < 0){
            return false;
        }
        // store each number you want to assess in a variable
        int number = x;

        // also store the reverse of the number
        int reverse = 0;
        while (number > 0 ){
            reverse = reverse * 10 + number % 10;
            number /= 10;
        }
        return x == reverse;
    }
}

package com.company;

import java.util.Scanner;
// IMPORT LIBRARY PACKAGES NEEDED BY YOUR PROGRAM
// SOME CLASSES WITHIN A PACKAGE MAY BE RESTRICTED
// DEFINE ANY CLASS AND METHOD NEEDED
// CLASS BEGINS, THIS CLASS IS REQUIRED
public class SolutionGCD
{
    // METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
    public int calculateGCD(int numA, int numB)
    {
        if (numB == 0){
            return numA;
        }
        return calculateGCD(numB, numA % numB);
    }

    public static void main(String[] args) {
        SolutionGCD calc = new SolutionGCD();
        Scanner input = new Scanner (System.in);
        System.out.println("Input number: ");
        int numA = input.nextInt();
        System.out.println("Input next number: ");
        int numB = input.nextInt();

        System.out.println();
        System.out.println("GCD of " + numA + " and " + numB + " = " + calc.calculateGCD(numA, numB));
    }
    // METHOD SIGNATURE ENDS
}


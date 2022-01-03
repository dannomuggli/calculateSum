package com.company;

import java.util.Scanner;
// IMPORT LIBRARY PACKAGES NEEDED BY YOUR PROGRAM
// SOME CLASSES WITHIN A PACKAGE MAY BE RESTRICTED
// DEFINE ANY CLASS AND METHOD NEEDED
// CLASS BEGINS, THIS CLASS IS REQUIRED
public class SolutionGCD
{
    // METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED

    // You need to set up a main method to execute the
    // method given to calculate the GCD

    // The method is the Euclidian solution for finding
    // the GCD. First, if B == 0 then the GCD would be
    // the first number. Otherwise  A % B will solve it
    public int calculateGCD(int numA, int numB)
    {
        if (numB == 0){
            return numA;
        }
        return calculateGCD(numB, numA % numB);
    }

    // For the main method you need to set a variable (calc)
    // up within solutionGCD class to run calculateGCD
    // You also need to import the scanner,
    // java.util.Scanner to make sure you can have the user
    // enter any numbers they want to solve for
    // assign each of the user entries to the numA and numB
    // The final print line has your variable (calc) with the
    // calculateGCD method running its result and returning
    // the proper answer. Viola!


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


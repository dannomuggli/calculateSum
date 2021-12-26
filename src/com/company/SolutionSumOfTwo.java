package com.company;

import java.util.Scanner;

public class SolutionSumOfTwo {

    public int calculateSum(){
        Scanner input = new Scanner(System.in);
        System.out.println("Input number: ");
        int numA = input.nextInt();
        System.out.println("Input next number: ");
        int numB = input.nextInt();
        int numC = numA + numB;
        return numC;
    }
    public static void main(String[] args) {
        // write your code here
        SolutionSumOfTwo numC = new SolutionSumOfTwo();
        System.out.println(numC.calculateSum());
    }


}

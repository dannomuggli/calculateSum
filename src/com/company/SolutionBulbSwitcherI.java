package com.company;

public class SolutionBulbSwitcherI {
    public int bulbSwitch(int n) {
        double square = Math.sqrt(n);
        double floor = Math.floor(square);
        return (int) floor;
    }
}

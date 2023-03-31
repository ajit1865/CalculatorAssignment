package com.knoldus.sbtcalculator;

/**
 * A class representing a simple calculator.
 */
public class Calculator {
    public int addTwoNumbers(int first, int second) {
        return first + second;
    }

    public int subtractionOfTwoNumbers(int first, int second) {
        return first - second;
    }

    public int multiplicationOfTwoNumbers(int first, int second) {
        return first * second;
    }

    public double divisioOfTwoNumbers(double first, double second) {
        //checking if second number is 0 then throw exception
        if (second == 0) {
            throw new IllegalArgumentException("Can't divide by zero");
        }
        return first / second;
    }
}

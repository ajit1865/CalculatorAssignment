
package com.knoldus.sbtcalculator;

/**
 * A class representing a simple calculator.
 */
public class Calculator {
    public int addTwoNumbers(int first, int second) {
         int sumOfTwoNumber = first + second;
         if(first > 0 && second > 0 && sumOfTwoNumber < 0){
             throw new ArithmeticException("Overflow");
         }
         return sumOfTwoNumber;
    }

    public int subtractionOfTwoNumbers(int first, int second) {
        return first - second;
    }

    public int multiplicationOfTwoNumbers(int first, int second) {
        int resultProduct = first * second;
        if(first > 0 && second > 0 && resultProduct < 0){
            throw new ArithmeticException("OverFlow");
        }
        return resultProduct;
    }


    public double divisioOfTwoNumbers(double first, double second) {
        //checking if second number is 0 then throw exception
        if (second == 0) {
            throw new ArithmeticException("Can't divide by zero");
        }
        return first / second;
    }
}

package com.example;

/**
 * A simple Calculator application.
 */
public class Calculator {

    /**
     * Subtracts the second integer from the first.
     *
     * @param a the minuend
     * @param b the subtrahend
     * @return the difference (a - b)
     */
    public int subtract(int a, int b) {
        return a - b;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("5 - 2 = " + calculator.subtract(5, 2));
        System.out.println("10 - 5 = " + calculator.subtract(10, 5));
    }
}

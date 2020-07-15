package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        int addResult = 12;
        int subtractResult = 8;

        if (addResult == calculator.additionAtoB(7, 5)) {
            System.out.println("Addition works");
        } else {
            System.out.println("Error of method add");
        }

        if (subtractResult == calculator.substractionAfromB(14, 6)) {
            System.out.println("Substraction works");
        } else System.out.println("Error of method subtract");
    }
}

package com.example.project;

public class CalculatorRunner {
    public static void main(String[] args) {

        //test your program here
        //1. create an instance of the calculator class
        Calculator calc = new Calculator("3");
        //2. call any methods of that class to test
        System.out.println(calc.performOperation("+", 8, 8));
        System.out.println(calc.divisibleBy(16, 8));
        System.out.println(calc.coordinatePair(1,2));
        System.out.println(calc.absoluteValue(4,6));
        System.out.println(calc.average(5,8));
        System.out.println(calc.info());
    }
}

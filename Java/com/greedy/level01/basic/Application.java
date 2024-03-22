package com.greedy.level01.basic;

public class Application {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.checkMethod();
        System.out.println();
        System.out.println(calculator.sum1to10());
        System.out.println();
        calculator.checkMaxNumber(10,20);
        System.out.println();
        System.out.println( calculator.sumTwoNumber(10,20));
        System.out.println();
        System.out.println(calculator.minusTwoNumber(10,5));

    }
}

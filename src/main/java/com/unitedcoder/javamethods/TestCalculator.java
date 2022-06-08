package com.unitedcoder.javamethods;

public class TestCalculator {
    public static void main(String[] args) {
        Calculator calculator= new Calculator();
        calculator.addTwoNumber(200,400);
        calculator.addMultipleNumber(20,50,40,60,80);
        System.out.println(calculator.addMultipleNumber(20,40,50,60,70));
        System.out.println(calculator.addTwoNumber(30,80));
        calculator.addTwoNumber(10000,20000);
    }

}

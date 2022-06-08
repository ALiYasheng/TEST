package com.unitedcoder.javamethods;

public class Calculator {
    public void calculatorInfo(){
        System.out.println("Welcome to our application!!");
        addTwoNumber(20,60);
    }
    //Method for add two number
    public int addTwoNumber(int aNumber, int bNumber) {
        int sum=aNumber+bNumber;
        System.out.println(sum);
        return sum;
    }
    public long addMultipleNumber(long...number){
        long sum=0;
        for (long eachNumber:number){
            sum+=eachNumber;
        }
        System.out.println(sum);
        return sum;
    }
}

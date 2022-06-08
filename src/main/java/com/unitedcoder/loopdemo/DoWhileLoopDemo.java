package com.unitedcoder.loopdemo;

public class DoWhileLoopDemo {
    public static void main(String[] args) {
        //odd number 1--100
        int i=1;
        do {
            if (i%2!=0){
                System.out.println(i);
            }i++;
        }while (i<=100);

        int num2=100;
        do {
            System.out.println(num2);
            i--;
        }while (num2>100);
    }
}

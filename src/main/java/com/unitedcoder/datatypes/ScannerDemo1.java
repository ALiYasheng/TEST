package com.unitedcoder.datatypes;

import java.util.Scanner;

public class ScannerDemo1 {
    //scanner object
    public static void main(String[] args) {
        Scanner inputValue= new Scanner(System.in);
        System.out.println("please enter first number");
        int x1=inputValue.nextInt();
        System.out.println("please enter second number");
        int x2=inputValue.nextInt();
        System.out.println("please enter third number");
        int x3=inputValue.nextInt();
        System.out.printf("%d +%d +%d =%d",x1,x2,x3,x1+x2+x3);
    }
}

package com.unitedcoder.datatypes;

import java.util.Scanner;

public class ScannerDemo2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("input your school name");
        String schoolName=input.next();
        System.out.println("Please enter your school address");
        String adderess=input.next();
        System.out.println("your school name is "+schoolName +"  and your adderess is " +schoolName);

    }
}

package com.unitedcoder.loopdemo;

import java.util.Scanner;

public class ForLoopDemo2 {
    public static void main(String[] args) {
        // sum of 1-100
        int sum=0;
        for (int i=1; i<=100; i++){
            sum=sum+i; // same as---sum+=i
            System.out.printf("i=%d sum=%d \n" ,i,sum);
        }
        // Sout. Should be out of curly bracket
        System.out.println("sum of 1 to 100 is  "+sum);
        System.out.println("==============================================================");

        //factorial 5=5*4*3*2*1
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter the number  ");
        double number= input.nextDouble();
        double sum2=1;
        for (double i=1; i<=number; i++){
            sum2=sum2*i; //same as factorial*=i
            System.out.printf("i=%a sum2=%a \n",i,sum2);
        }
        System.out.println("Result of Factorial 5 is "+sum2);
        System.out.println("==============================================================");

        //Calculate even  how many number  1 to 10000.int
        int count=0;
        int i=1;
        for (i=1; i<=10;i++){
            if (i%2==0){
                count=count+1; //same as count++ 自加1
            }
        }
        System.out.println(count);
    }
}

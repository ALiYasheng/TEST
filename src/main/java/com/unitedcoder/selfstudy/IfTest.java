package com.unitedcoder.selfstudy;

import java.util.Scanner;

// input three number
//print out from small to big by if else method
public class IfTest {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("Please enter the first number: ");
        int number1=scanner.nextInt();
        System.out.println("Please enter the second number: ");
        int number2=scanner.nextInt();
        System.out.println("Please enter the third number: ");
        int number3=scanner.nextInt();
        if (number1>number2){
            if (number3>=number1){//如果比大的还要大，那就是最大
                System.out.println(number2 + "<" +number1 + "<" + number3);
            }else if (number3<=number2){//如果比小的还小，那就是最小
                System.out.println(number3 + "<" +number2 + "<" + number1);
            }else {//如果让放两个条件都不满足，
                System.out.println(number2 + "<" +number3 + "<" + number1);
            }


        }else{//如果最初的条件不成立，那么就是number2>number1
            if (number3>=number2){//如果number3比大的更大，那就是最大
                System.out.println(number1 + "<" +number2 + "<" + number3);
            }else if (number3<=number1){//如果比小的还小，那就是最小
                System.out.println(number3 + "<" +number1 + "<" + number1);
                }else{
                System.out.println(number1 + "<" +number3 + "<" + number2);
            }
        }

    }
}

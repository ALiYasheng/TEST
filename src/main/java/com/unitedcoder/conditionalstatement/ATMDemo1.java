package com.unitedcoder.conditionalstatement;

import java.util.Scanner;

public class ATMDemo1 {
    public static void main(String[] args) {
        int pinNumber=12345678;
        int balance=10000;
        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter your pin number");
        int x=scanner.nextInt();
        if(x==pinNumber){
            System.out.println("Your pin number was entered correctly, Please slect any option");
            String menu=scanner.next();
            if (menu.equalsIgnoreCase("withdraw")){
                System.out.println("Please enter amount yuo want to withdraw");
                int amount1=scanner.nextInt();
                System.out.printf("Please take you cash, your account balace now is %d",balance-amount1);
            };
        }else
            System.out.println("your pin number is wrong");


    }
}

package com.unitedcoder.loopdemo;


import java.util.Scanner;

public class ATMLoopDemo {
    public static void main(String[] args) {
        int pinNumber=12345;
        int balance=1000;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter your pin number: ");
        int chance=3;
        int i=0;
        do {
            i++;
            int password=scanner.nextInt();
            if (password==pinNumber){
                System.out.println("Congratlation boy");
            break;
            }
            else
            System.out.println(" something wrong my dear");

        }while (i<3);
    }
}

package com.unitedcoder.selfstudy;

import java.util.Scanner;

//
public class ScannerDemo1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Please enter your test result: ");
        int score = input.nextInt();

        if (score==100){
            System.out.println("you got a BMW as prize");
        }else if (score>80 && score<90){
            System.out.println("you got a prize : X MAX");
        }else if (score>60 && score<80) {
            System.out.println("you got a prize : ipad");
        }else {
            System.out.println("Sorry you should study more...");
        }
    }

}

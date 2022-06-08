package com.unitedcoder.selfstudy;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Lottery {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println(" please enter the number: ");

        //获得一个随机的整数
        int value = (int) (Math.random()*90+10); //[0,0, 1,0)-->[0,0,90,0)-->[10,0, 100,0)-->[10,99]
        int input = scanner.nextInt();
        System.out.println("Please check it if you choose the correct number>>>>"+value);
        if (value ==input){
            System.out.println("you got a prize:  ");
        }else{
            System.out.println(" Please try again");
        }
    }
}

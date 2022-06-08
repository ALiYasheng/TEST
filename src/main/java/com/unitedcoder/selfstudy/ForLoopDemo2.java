/*
* 输入两个正整数m和n，求其最大公约数和最小公倍数
* 比如：12和20的最大公约数是4，最小公倍数是60
* 说明： break关键字的使用
*  */
package com.unitedcoder.selfstudy;


import java.util.Scanner;

public class ForLoopDemo2 {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        System.out.println("Please enter the first number: ");
        int number1=scanner.nextInt();
        System.out.println("Please enter the second number: ");
        int number2=scanner.nextInt();


            if (number1<number2){
                for (int i=number1;i>0;i--){
                    if (number1%i==0 && number2%i==0){
                        System.out.println("最大公约数为 "+i);
                        break;
                }
                }
            }else if (number2<number1){
                for (int i=number2;i>0;i--) {
                    if (number1 % i == 0 && number2 % i == 0) {
                        System.out.println("最大公约数为 " + i);
                        break;
                    }
                }
            }
        System.out.println("<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>");

        /*if (number1<number2){
            for (int i%number1%=number1;i>0;i--){
                if (i==0 && number2%i==0){
                    System.out.println("最大公约数为 "+i);
                    break;
                }
            }
        }else if (number2<number1){
            for (int i=number2;i>0;i--) {
                if (number1 % i == 0 && number2 % i == 0) {
                    System.out.println("最大公约数为 " + i);
                    break;
                }
            }
        }
*/

    }
}

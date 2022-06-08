package com.unitedcoder.selfstudy;
/* do while loop standard format
do {循环体} while (条件判断)；
扩展格式：
       初始化语句；do {循环体；步进语句} while (条件判断)
   */
public class Demo2DoWhile {
    public static void main(String[] args) {
        for (int i = 1; i<= 10; i++) {
            System.out.println("i am wrong   " +i );
        }
        System.out.println("================");
        int i = 1; //1.初始化语句
        do {
            System.out.println("i am wrong  " +i);//3循环体
            i++; //步进语句
    }
            while (i<= 10); //2.条件判断
        System.out.println("===================");}
}

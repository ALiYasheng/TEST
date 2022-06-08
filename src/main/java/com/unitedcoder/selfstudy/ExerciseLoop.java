package com.unitedcoder.selfstudy;
//计算1 到 100 之内 偶数之和。
public class ExerciseLoop {
    public static void main(String[] args) {
        /*int sum= 0;
        for (int i =1; i <=100; i++) {
            if (i % 2 ==0) {
                sum += i;
            }
        }
        System.out.println("Final Result is "+sum);
        System.out.println("=========================");*/
        int sum = 0;
        int i = 1;
        while (i <=100){if( i%2==0){
            sum +=i;} i++;
        }
        System.out.println( "Final Result is  "+sum);


    }
}

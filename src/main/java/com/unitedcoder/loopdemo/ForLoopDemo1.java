package com.unitedcoder.loopdemo;

public class ForLoopDemo1 {
    public static void main(String[] args) {
        //print out number 1--1000
        for (int i=1;i<=100;i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        // print out from 100 to 1
        for (int i=100; i>0; i--){
            System.out.print(i+" ");
        }
        System.out.println();
        //even number between 1-1000
        for (int i=1; i<1000;i++){
            if (i%2==0&i%3==0){
                System.out.print(i+" ");
            }
        }

        for (int i=1; i<=20; i=i*2){
            System.out.print(i+" ");
        }

    }
}

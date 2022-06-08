package com.unitedcoder.loopdemo;

public class WhileLoopDemo {
    public static void main(String[] args) {
        //print out odd number between 1 --100
        int i=1;
        int oddNumber=0;
        while (i<100){
            if (i%2==1){//  Same as i%2!=0
                System.out.print(i+" ");
                oddNumber++;
            }i++;
        }
        System.out.println();
        System.out.println(i);
        System.out.println(oddNumber);
    }
}
